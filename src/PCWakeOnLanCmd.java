
public class PCWakeOnLanCmd implements Command{    

    private Computer computer;

    public PCWakeOnLanCmd(Computer computer)
    {
        this.computer= computer;
    }
    public void execute()
    {
        computer.WakeOnLan();
    }
}
