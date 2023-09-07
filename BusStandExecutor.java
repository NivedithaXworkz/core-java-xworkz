class BusStandExecutor{
 
 public static void main(String stop[]){
 BusStand bus = new BusStand();
 bus.setBusNo(8);
 bus.getBusNo();
 System.out.println("The bus no is :" + bus.getBusNo()); 
 
 bus.setBusName("Rajahamsa");
 bus.getBusName();
 System.out.println("The bus name is :" + bus.getBusName());

 bus.setDestination("Hassan");
 bus.getDestination();
 System.out.println("The destination is :" + bus.getDestination());
 
 bus.setNoOfPassengers(45);
 bus.getNoOfPassengers();
 System.out.println("The noOfPassengers is :" + bus.getNoOfPassengers());
 
 bus.setNoOfFoodCourt(10);
 bus.getNoOfFoodCourt();
 System.out.println("The noOfFoodCourt is :" + bus.getNoOfFoodCourt());
 }
 }

 
