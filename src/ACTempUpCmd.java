
public class ACTempUpCmd implements Command{

	private AirConditioner AC;
	
	public ACTempUpCmd(AirConditioner AC)
	{
		this.AC=AC;
	}
	public void execute()
	{
		AC.TempUp();
	}
}
