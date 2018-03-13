package javalang;

import fr.imta.naomod.Context;
import fr.imta.naomod.Logger;
import framework.IoTCompiler;
import lang.iotlang.Configuration;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Thing;
import lang.util.Helpers;
import utilities.ModelHelpers;

public class JavalangCompiler extends IoTCompiler{
	
	public void do_call_compiler(IoTLangModel self,Configuration cfg, Logger log, String... options) {

		JavalangContext ctx = new JavalangContext(this);
        //processDebug(cfg);
        ctx.setCurrentConfiguration(cfg);
        //ctx.setOutputDirectory(new File(ctx.getOutputDirectory(), cfg.getName()));

        //Checker
        //this.checker.do_check(cfg, false);
        //this.checker.printReport(log);

        // GENERATE A MODULE FOR EACH THING
        for (Thing thing : ModelHelpers.allThingsRoot(self)) {
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
	
	@Override
    public IoTCompiler clone() {
        return new JavalangCompiler();
    }
	
	@Override
    public String getID() {
        return "java";
    }

    @Override
    public String getName() {
        return "Java compiler";
    }

    public String getDescription() {
        return "Generates Java code for Linux or other Posix runtime environments (GCC compiler).";
    }

	@Override
	public void compile(IoTLangModel self,Configuration cfg, Logger log, String... options) {
		log.info("Running " + getName() + " compiler on configuration " + cfg.getName());
		final long start = System.currentTimeMillis();
		
		//compile
		do_call_compiler(self,cfg, log, options);
		log.info("Compilation complete. Took " + (System.currentTimeMillis() - start) + " ms.");
	}
}