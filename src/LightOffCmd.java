public class LightOffCmd implements Command{
   private AllLights light;
   public LightOffCmd(AllLights light)
   {
      this.light=light;
   }

   public void execute()
   {
	   light.turnOff();
   }
}