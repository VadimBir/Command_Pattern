
public class PCShutdownCmd implements Command{    

    private Computer computer;

    public PCShutdownCmd(Computer computer)
    {
        this.computer= computer;
    }
    public void execute()
    {
        computer.ShutDown();
    }
}
