
public class LightOnCmd implements Command{
   private AllLights light;

   public LightOnCmd(AllLights light)
   {
      this.light=light;
   }
   public void execute()
   {
	   light.turnOn();
   }
}

