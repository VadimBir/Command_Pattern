
public class AirConditioner {

	double temperature = 21; 
	
   public void On()
   {
      System.out.println("The AC is on, temperature: " + temperature);
   }
   public void Off()
   {
      System.out.println("The AC is off");
   }
   public void TempUp()
   {
      if(temperature >= 15 && temperature < 40) {     		 
         temperature= temperature + 0.5;
         System.out.println("Temperature increased to " + temperature);
      }
   }
   public void TempDown()
   {
      if(temperature > 15 && temperature <= 40) {     		 
         temperature= temperature - 0.5;
         System.out.println("Temperature decreased to " + temperature);
      }
   }
}
