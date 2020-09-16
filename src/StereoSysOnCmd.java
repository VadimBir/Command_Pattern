
public class StereoSysOnCmd implements Command {
	
	private StereoSystem StereoSys;
	
	public StereoSysOnCmd(StereoSystem StereoSys)
	{
		this.StereoSys=StereoSys;
	}
	
	public void execute() 
	{
		StereoSys.On();
	}

}
