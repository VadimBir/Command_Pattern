
public class ACTempDownCmd implements Command{

	private AirConditioner AC;
	
	public ACTempDownCmd(AirConditioner AC)
	{
		this.AC=AC;
	}
	public void execute()
	{
		AC.TempDown();
	}
}
