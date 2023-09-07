class AmusementPark{
	
 int typesOfRides;
 int noOfPeoples;
 int noOfAcrobats;
 String parkName;
 String location;
 
 public AmusementPark(int typesOfRides ,int noOfPeoples ,  int noOfAcrobats, String parkName ,String location )
 {
 this.typesOfRides = typesOfRides;
 this.noOfPeoples = noOfPeoples;
 this.noOfAcrobats = noOfAcrobats;
 this.parkName = parkName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfRides is:" +typesOfRides);
 System.out.println("The noOfPeoples is:" + noOfPeoples);
 System.out.println("The noOfAcrobats is:" + noOfAcrobats);
 System.out.println("The parkName is:" + parkName);
 System.out.println("The location is:" + location);
 }
 }