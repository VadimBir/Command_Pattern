
public class StereoSystem {
	
	private int volume = 50;
	
	public void On()
	{
        System.out.println("Playing Music...");
    }
	public void Off()
	{
        System.out.println("Music stoped");
    }
	public void VolumeUp() 
	{
    	 if(volume >= 0 && volume < 100) {    		 
    	 volume= volume + 5;
    	 System.out.println("Volume increased to " + volume);
    	 }
    }
	public void VolumeDown()
	{
		if(volume <= 100 && volume > 0) {    		 
			volume= volume - 5;
			System.out.println("Volume decreased to " + volume);
    	}
    }
}
