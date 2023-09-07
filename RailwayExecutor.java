class RailwayExecutor{
 
 public static void main(String station[]){
 Railway railway = new Railway();
 railway.setRailwayId(2);
 railway.getRailwayId();
 System.out.println("The railway id is :" + railway.getRailwayId());
 
 railway.setRailwayName("Chennai Express");
 railway.getRailwayName();
 System.out.println("The railway name is :" + railway.getRailwayName());
 
 railway.setLocation("Bangalore");
 railway.getLocation();
 System.out.println("The location is :" + railway.getLocation());
 
 railway.setNoOfWorkers(10);
 railway.getNoOfWorkers();
 System.out.println("The noOfWorkers is :" + railway.getNoOfWorkers());
 
 railway.setManagerName("Naveen");
 railway.getManagerName();
 System.out.println("The manager name is :" + railway.getManagerName());
 }
 }