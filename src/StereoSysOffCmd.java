
public class StereoSysOffCmd implements Command {
	
	private StereoSystem StereoSys;
	
	public StereoSysOffCmd(StereoSystem StereoSys)
	{
		this.StereoSys=StereoSys;
	}
	public void execute() 
	{
		StereoSys.Off();	
	}
}
