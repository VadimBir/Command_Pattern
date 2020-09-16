
public class StereoSysVolDownCmd implements Command {

	private StereoSystem StereoSys;
	
	public StereoSysVolDownCmd(StereoSystem StereoSys)
	{
		this.StereoSys=StereoSys;
	}
	
	public void execute() 
	{
		StereoSys.VolumeDown();
	}

}
