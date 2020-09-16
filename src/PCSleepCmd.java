
public class PCSleepCmd implements Command{    


    private Computer computer;

    public PCSleepCmd(Computer computer)
    {
        this.computer= computer;
    }

    public void execute()
    {
        computer.Sleep();
    }
}
