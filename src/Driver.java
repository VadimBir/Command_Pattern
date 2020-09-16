public class Driver{
   public static void main(String[] args){

	   AllLights l=new AllLights();
       Computer desktopPC = new Computer();
       AirConditioner AC = new AirConditioner();
       StereoSystem stereoSys = new StereoSystem();
       
       
       Command lTurnOn=new LightOnCmd(l);
       Command lTurnOff=new LightOffCmd(l);

       Command ACon = new ACOnCmd(AC);
       Command ACoff = new ACOffCmd(AC);
       Command ACup= new ACTempUpCmd(AC);
       Command ACdown= new ACTempDownCmd(AC);
      
       
       Command stereoSysOn = new StereoSysOnCmd(stereoSys);
       Command stereoSysOff = new StereoSysOffCmd(stereoSys);
       Command stereoSysUp= new StereoSysVolUpCmd(stereoSys);
       Command stereoSysDown= new StereoSysVolDownCmd(stereoSys);
       
       Command[] CmdArrStereoSys;
       CmdArrStereoSys =  new Command[4];
       
       CmdArrStereoSys[0]= new StereoSysOnCmd(stereoSys);
       CmdArrStereoSys[1]= new StereoSysOffCmd(stereoSys);
       CmdArrStereoSys[2]= new StereoSysVolUpCmd(stereoSys);
       CmdArrStereoSys[3]= new StereoSysVolDownCmd(stereoSys);

       Command RebootPC = new PCRebootCmd(desktopPC);
       Command ShutdownPC = new PCShutdownCmd(desktopPC);
       Command SleepPC = new PCSleepCmd(desktopPC);
       Command WakeOnLanPC = new PCWakeOnLanCmd(desktopPC); 
       
       Command[] CmdArrPC;
       CmdArrPC =  new Command[4];
       
       CmdArrPC[0]= new PCRebootCmd(desktopPC);
       CmdArrPC[1]= new PCShutdownCmd(desktopPC);
       CmdArrPC[2]= new PCSleepCmd(desktopPC);
       CmdArrPC[3]= new PCWakeOnLanCmd(desktopPC);
       
       ControlPanel LightCtrl=new ControlPanel(lTurnOn,lTurnOff);
       ControlPanel ACCtrl= new ControlPanel(ACon, ACoff,ACup, ACdown );
       ControlPanel StereoSysCtrl= new ControlPanel(stereoSysOn, stereoSysOff, stereoSysUp, stereoSysDown);
       ControlPanel StereoSysCtrlArr= new ControlPanel(CmdArrStereoSys);
       ControlPanel PCCtrl = new ControlPanel(WakeOnLanPC,ShutdownPC, RebootPC, SleepPC  );
       ControlPanel PCCtrlArr= new ControlPanel(CmdArrPC);

       LightCtrl.OnCmd();
       LightCtrl.OffCmd();
       System.out.println("\n");
       ACCtrl.OnCmd();
       ACCtrl.Cmd3();
       ACCtrl.Cmd3();
       ACCtrl.Cmd4();
       ACCtrl.OffCmd();

       /*
       System.out.println("\n");
       StereoSysCtrl.OnCmd();
       StereoSysCtrl.Cmd3();
       StereoSysCtrl.Cmd3();
       StereoSysCtrl.Cmd4();
       StereoSysCtrl.OffCmd();
        */
       System.out.println("\n");


       StereoSysCtrlArr.CmdArr(0);
       StereoSysCtrlArr.CmdArr(2);
       StereoSysCtrlArr.CmdArr(2);
       StereoSysCtrlArr.CmdArr(3);
       StereoSysCtrlArr.CmdArr(1);


        System.out.println("\n");
       System.out.println("\n");


       System.out.println("\n");
       PCCtrl.OnCmd();
       PCCtrl.Cmd3();
       PCCtrl.Cmd4();
       PCCtrl.OffCmd();
       
       System.out.println("\n");
       System.out.println("\n");
       
       PCCtrlArr.CmdArr(3);
       PCCtrlArr.CmdArr(0);
       PCCtrlArr.CmdArr(2);
       PCCtrlArr.CmdArr(1);
       
       




       
   }
}