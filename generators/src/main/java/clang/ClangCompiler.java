package clang;

import org.thingml.utilities.logging.Logger;
import org.thingml.xtext.constraints.ThingMLHelpers;

import framework.IoTCompiler;
import lang.iotlang.Configuration;
import lang.iotlang.Thing;
import lang.util.Helpers;
import utilities.ModelHelpers;

public class ClangCompiler extends IoTCompiler{
	public void do_call_compiler(Configuration cfg, Logger log, String... options) {

		ClangContext ctx = new ClangContext();
        //processDebug(cfg);
        ctx.setCurrentConfiguration(cfg);
        //ctx.setOutputDirectory(new File(ctx.getOutputDirectory(), cfg.getName()));

        //Checker
        //this.checker.do_check(cfg, false);
        //this.checker.printReport(log);

        // GENERATE A MODULE FOR EACH THING
        for (Thing thing : ModelHelpers.allThings(cfg)) {
            ctx.setConcreteThing(thing);
            // GENERATE HEADER
            ctx.getCompiler().getThingApiCompiler().generatePublicAPI(thing, ctx);

            // GENERATE IMPL
            ctx.getCompiler().getThingImplCompiler().generateImplementation(thing, ctx);
            ctx.clearConcreteThing();
        }

        // GENERATE A MODULE FOR THE CONFIGURATION (+ its dependencies)
        getMainCompiler().generateMainAndInit(cfg, Helpers.findContainingModel(cfg), ctx);

        //GENERATE A DOCKERFILE IF ASKED
        ctx.getCompiler().getCfgBuildCompiler().generateDockerFile(cfg, ctx);
        
        // GENERATE A MAKEFILE
        getCfgBuildCompiler().generateBuildScript(cfg, ctx);

        // WRITE THE GENERATED CODE
        ctx.writeGeneratedCodeToFiles();
      
        // COPY OUTPUT FILES
        ctx.copyFilesToOutput();

    }
}
