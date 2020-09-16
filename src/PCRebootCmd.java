
public class PCRebootCmd implements Command{    


    private Computer computer;

    public PCRebootCmd(Computer computer)
    {
        this.computer= computer;
    }

    public void execute()
    {
        computer.Reboot();
    }
}
