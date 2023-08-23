class Fan{

	static boolean isConnected;//static variable
	static int minSpeed;
	static int maxSpeed =4;
	static int currentSpeed;
	public static boolean on(){
	System.out.println("starting of the Fan on");

	if (isConnected == false){
		isConnected = true;
	System.out.println("the Speed is turned on....");
	System.out.println("end of the Fan On");
	}
	return isConnected;
	}
	public static boolean off(){
		System.out.println("starting of the Fan off");
	 if (isConnected == true){
	isConnected = false ;
	System.out.println("the Speed is turned Off");
	System.out.println("end of the Fan Off");
	 }
	return isConnected;
	}

	public static boolean increaseSpeed(){
		System.out.println("start of increase Speed");

		if (isConnected == true){
			if (currentSpeed < maxSpeed){

				currentSpeed= currentSpeed +1;
				System.out.println("the current Speed is " + currentSpeed);

			}
			else {
				System.out.println("max Speed is reached");
			}

		}
		else{
			System.out.println(" turn on the Fan...");
		}
		System.out.println("end of increase Speed");
		return isConnected;
	}

public static boolean decreaseSpeed(){
		System.out.println("start of decrease Speed");

		if (isConnected == true){
			if (currentSpeed > minSpeed){

				currentSpeed= currentSpeed -1;
				System.out.println("the current Speed is " + currentSpeed);

			}
			else {
				System.out.println("min Speed is reached");
			}

		}
		else{
			System.out.println("turn on the Fan...");
		}
		System.out.println("end of decrease Speed");
		return isConnected;

	}

}