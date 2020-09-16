public class Driver{
    public static void main(String[] args){

        AllLights Lights=new AllLights();
        Computer desktopPC = new Computer();
        AirConditioner AC = new AirConditioner();
        StereoSystem stereoSys = new StereoSystem();
        
        Command[] CmdArrLight;
        CmdArrLight =  new Command[4];
        CmdArrLight[0]= new LightOnCmd(Lights);
        CmdArrLight[1]= new LightOffCmd(Lights);

        Command[] CmdArrAC;
        CmdArrAC =  new Command[4];
        CmdArrAC[0]= new ACOnCmd(AC);
        CmdArrAC[1]= new ACOffCmd(AC);
        CmdArrAC[2]= new ACTempUpCmd(AC);
        CmdArrAC[3]= new ACTempDownCmd(AC);
        
        Command[] CmdArrStereoSys;
        CmdArrStereoSys =  new Command[4];
        CmdArrStereoSys[0]= new StereoSysOnCmd(stereoSys);
        CmdArrStereoSys[1]= new StereoSysOffCmd(stereoSys);
        CmdArrStereoSys[2]= new StereoSysVolUpCmd(stereoSys);
        CmdArrStereoSys[3]= new StereoSysVolDownCmd(stereoSys);
    
        Command[] CmdArrPC;
        CmdArrPC =  new Command[4];
        CmdArrPC[0]= new PCRebootCmd(desktopPC);
        CmdArrPC[1]= new PCShutdownCmd(desktopPC);
        CmdArrPC[2]= new PCSleepCmd(desktopPC);
        CmdArrPC[3]= new PCWakeOnLanCmd(desktopPC);
        
        ControlPanel LightCtrlArr=new ControlPanel(CmdArrLight);
        ControlPanel ACCtrlArr= new ControlPanel(CmdArrAC);
        ControlPanel StereoSysCtrlArr= new ControlPanel(CmdArrStereoSys);
        ControlPanel PCCtrlArr= new ControlPanel(CmdArrPC);

        LightCtrlArr.CmdArr(0);
        LightCtrlArr.CmdArr(1);

        System.out.println("\n");
        
        ACCtrlArr.CmdArr(0);
        ACCtrlArr.CmdArr(2);
        ACCtrlArr.CmdArr(2);
        ACCtrlArr.CmdArr(3);
        ACCtrlArr.CmdArr(1);

        System.out.println("\n");

        StereoSysCtrlArr.CmdArr(0);
        StereoSysCtrlArr.CmdArr(2);
        StereoSysCtrlArr.CmdArr(2);
        StereoSysCtrlArr.CmdArr(3);
        StereoSysCtrlArr.CmdArr(1);

        System.out.println("\n");
        
        PCCtrlArr.CmdArr(3);
        PCCtrlArr.CmdArr(0);
        PCCtrlArr.CmdArr(2);
        PCCtrlArr.CmdArr(1);
   }
}