class HardwareExecutor{
	public static void main(String work[]){
		
	
	Hardware hardware=new Hardware();
	hardware.setHardwareName("Poco X3");
	hardware.setPrice(25000);
	hardware.setComanyName("Redmi");
	hardware.setWeigth(350);
		
	Software software=new Software();
	software.hardware=hardware;
	software.softwareName="Android 12"; 				
	System.out.println("The Software in Hardware is : "+ software.softwareName);
	System.out.println("The Hardware Component Name is: "+ software.hardware.getHardwareName());
	System.out.println("The Price of the Hardware Component is: "+ software.hardware.getPrice());
	System.out.println("The Company is: "+ software.hardware.getComanyName());
	System.out.println("The weigth of the component in grams is: "+ software.hardware.getWeigth());		
						
	}
}