import java.util.HashMap;

public class Driver{
    public static void main(String[] args){

        AllLights Lights=new AllLights();
        Computer desktopPC = new Computer();
        AirConditioner AC = new AirConditioner();
        StereoSystem stereoSys = new StereoSystem();

        HashMap<String, Integer> CmdMap = new HashMap<String, Integer>(); 
        
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
        
        CmdMap.put("On", 0);
        CmdMap.put("Off", 1);
        CmdMap.put("VolUp", 2);
        CmdMap.put("VolDown", 3);
        CmdMap.put("TempUp", 2);
        CmdMap.put("TempDown", 3);
        CmdMap.put("Shutdown", 1);
        CmdMap.put("WakeOnLan", 3);
        CmdMap.put("Sleep", 2);
        CmdMap.put("Reboot", 0);

        LightCtrlArr.CmdArr(CmdMap.get("On"));
        LightCtrlArr.CmdArr(CmdMap.get("Off"));
        
        System.out.println("\n");
        
        ACCtrlArr.CmdArr(CmdMap.get("On"));
        ACCtrlArr.CmdArr(CmdMap.get("TempUp"));
        ACCtrlArr.CmdArr(CmdMap.get("TempUp"));
        ACCtrlArr.CmdArr(CmdMap.get("TempUp"));
        ACCtrlArr.CmdArr(CmdMap.get("TempUp"));
        ACCtrlArr.CmdArr(CmdMap.get("TempDown"));
        ACCtrlArr.CmdArr(CmdMap.get("Off"));
        ACCtrlArr.CmdArr(CmdMap.get("On")); // This line is here on purpose 
        
        System.out.println("\n");
        
        StereoSysCtrlArr.CmdArr(CmdMap.get("On"));
        StereoSysCtrlArr.CmdArr(CmdMap.get("VolUp"));
        StereoSysCtrlArr.CmdArr(CmdMap.get("Off"));
        
        System.out.println("\n");
        
        PCCtrlArr.CmdArr(CmdMap.get("WakeOnLan"));
        PCCtrlArr.CmdArr(CmdMap.get("Reboot"));
        PCCtrlArr.CmdArr(CmdMap.get("Sleep"));
        PCCtrlArr.CmdArr(CmdMap.get("Shutdown"));
    }
}