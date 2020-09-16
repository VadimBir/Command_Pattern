
public class ACOnCmd implements Command{

	private AirConditioner AC;
	
	public ACOnCmd(AirConditioner AC)
	{
		this.AC=AC;
	}
	public void execute()
	{
		AC.On();
	}
}
