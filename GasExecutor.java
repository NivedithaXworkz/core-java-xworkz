class GasExecutor {
    public static void main(String cook[]) {
       Gas gas=new Gas();
	   gas.setGasName("Domestic usage");
	   gas.setVolume(12.5);
	   gas.setPrice(1500.00);
	   
	   Cylinder cylinder=new Cylinder();
	   cylinder.gas=gas;
	   cylinder.cylinderName="Bharath";
							
    System.out.println("The Cylinder Name is: " + cylinder.cylinderName);
    System.out.println("The Gas Type is: " + cylinder.gas.getGasName());
    System.out.println("The Gas Volumeis: " + cylinder.gas.getVolume());
	System.out.println("The Gas price is: " + cylinder.gas.getPrice());
								
    }
}