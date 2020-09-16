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

       Command RebootPC = new PCRebootCmd(desktopPC);
       Command ShutdownPC = new PCShutdownCmd(desktopPC);
       Command SleepPC = new PCSleepCmd(desktopPC);
       Command WakeOnLanPC = new PCWakeOnLanCmd(desktopPC); 
       
       Command[] arr;
       arr =  new Command[3];
       
       arr[0]= RebootPC;
       arr[1]= ShutdownPC;
       arr[2]= SleepPC;
       
       ControlPanel LightCtrl=new ControlPanel(lTurnOn,lTurnOff);
       ControlPanel ACCtrl= new ControlPanel(ACon, ACoff,ACup, ACdown );
       ControlPanel StereoSysCtrl= new ControlPanel(stereoSysOn, stereoSysOff, stereoSysUp, stereoSysDown);
       ControlPanel PCCtrl = new ControlPanel(WakeOnLanPC,ShutdownPC, RebootPC, SleepPC  );
       ControlPanel TestArr= new ControlPanel(arr);

       LightCtrl.OnCmd();
       LightCtrl.OffCmd();
       System.out.println("\n");
       ACCtrl.OnCmd();
       ACCtrl.Cmd3();
       ACCtrl.Cmd3();
       ACCtrl.Cmd4();
       ACCtrl.OffCmd();
       System.out.println("\n");
       StereoSysCtrl.OnCmd();
       StereoSysCtrl.Cmd3();
       StereoSysCtrl.Cmd3();
       StereoSysCtrl.Cmd4();
       StereoSysCtrl.OffCmd();
       System.out.println("\n");
       PCCtrl.OnCmd();
       PCCtrl.Cmd3();
       PCCtrl.Cmd4();
       PCCtrl.OffCmd();
       
       System.out.println("\n");
       //System.out.println("\n");
       




       
   }
}