public class ControlPanel {
    /*
    private Command Cmd1;
    private Command Cmd2;
    private Command Cmd3;
    private Command Cmd4;
    */
    private Command Cmd[];
    /*
    public ControlPanel(Command Cmd1,Command Cmd2)
    {
         this.Cmd1=Cmd1;
         this.Cmd2=Cmd2;
    }
    public ControlPanel(Command Cmd1,Command Cmd2, Command Cmd3, Command Cmd4)
    {
        this.Cmd1=Cmd1;
        this.Cmd2=Cmd2;
        this.Cmd3=Cmd3;
        this.Cmd4=Cmd4;
    }
    */
    public ControlPanel(Command arr[])
    {
        Cmd = new Command[arr.length];
        for(int i = 0; i < arr.length; i++ ){
            this.Cmd[i]=arr[i];
        }
    }
    /*
    public void OnCmd()
    {
    	Cmd1.execute();
    }
    public void OffCmd()
    {
    	Cmd2.execute();
    }
    public void Cmd3()
    {
    	Cmd3.execute();
    }
    public void Cmd4()
    {
    	Cmd4.execute();
    }
    */
    public void CmdArr(int i)
    {
        Cmd[i].execute();
    }
}