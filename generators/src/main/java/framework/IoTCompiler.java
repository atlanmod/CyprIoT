package framework;


public class IoTCompiler {
	private ActionCompiler thingActionCompiler;
	private ApiCompiler thingApiCompiler;
	private CfgMainGenerator mainCompiler;
	private CfgBuildCompiler cfgBuildCompiler;
	private ImplCompiler thingImplCompiler;
	
	public IoTCompiler() {
        this.setThingActionCompiler(new ActionCompiler());
        this.setThingApiCompiler(new ApiCompiler());
        this.setMainCompiler(new CfgMainGenerator());
        this.setCfgBuildCompiler(new CfgBuildCompiler());
        this.setThingImplCompiler(new ImplCompiler());
    }
	public ImplCompiler getThingImplCompiler() {
		return thingImplCompiler;
	}
	public void setThingImplCompiler(ImplCompiler thingImplCompiler) {
		this.thingImplCompiler = thingImplCompiler;
	}
	public CfgBuildCompiler getCfgBuildCompiler() {
		return cfgBuildCompiler;
	}
	public void setCfgBuildCompiler(CfgBuildCompiler cfgBuildCompiler) {
		this.cfgBuildCompiler = cfgBuildCompiler;
	}
	public CfgMainGenerator getMainCompiler() {
		return mainCompiler;
	}
	public void setMainCompiler(CfgMainGenerator mainCompiler) {
		this.mainCompiler = mainCompiler;
	}
	public ActionCompiler getThingActionCompiler() {
		return thingActionCompiler;
	}
	public void setThingActionCompiler(ActionCompiler thingActionCompiler) {
		this.thingActionCompiler = thingActionCompiler;
	}
	public ApiCompiler getThingApiCompiler() {
		return thingApiCompiler;
	}
	public void setThingApiCompiler(ApiCompiler thingApiCompiler) {
		this.thingApiCompiler = thingApiCompiler;
	}

}
