
public class StereoSysVolUpCmd implements Command {

	private StereoSystem StereoSys;
	
	public StereoSysVolUpCmd(StereoSystem StereoSys)
	{
		this.StereoSys=StereoSys;
	}
	
	public void execute() 
	{
		StereoSys.VolumeUp();
	}

}
