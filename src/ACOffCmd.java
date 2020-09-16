
public class ACOffCmd implements Command{
	private AirConditioner AC;
	
	public ACOffCmd(AirConditioner AC)
	{
		this.AC=AC;
	}
	
	public void execute()
	{
		AC.Off();
	}
}
