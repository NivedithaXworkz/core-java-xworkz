class Television {
static boolean isConnected;
static int minVolume;
static int maxVolume = 12;
static int currentVolume ;
public static boolean onOroff(){
	System.out.println("Starting of the onOroff");
	if(isConnected == false){
		isConnected = true;
		System.out.println("The speaker is Turned on...");
	}else if(isConnected == true){
	     isConnected = false;
		System.out.println("The speaker is Turned off...");
	}
	System.out.println("End of the onOroff");
	return isConnected;
}
 public static void increaseVolume(){
	System.out.println("Start of increaseVolume");
	if(isConnected == true){
		if(currentVolume < maxVolume){
			currentVolume = currentVolume +1 ;
			System.out.println("The current volume is "+ currentVolume);
		}
		else{
			System.out.println("Max volume is reached");
			}
	}else{
		System.out.println("Turn on the speaker");
	}
	System.out.println("End of decreaseVolume");
	}
	public static void decreaseVolume(){
	System.out.println("Start of decreaseVolume");
	if(isConnected == true){
		if(currentVolume > minVolume){
			currentVolume = currentVolume -1 ;
			System.out.println("The current volume is "+ currentVolume);
		}
		else{
			System.out.println("Min volume is reached");
			
			}
	}else{
		System.out.println("Turn on the speaker");
	}
	System.out.println("End of decreaseVolume");
	}
	
}
