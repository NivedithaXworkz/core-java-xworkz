class TouristPlaces{
	
 int typesOfFood;
 int noOfPeoples;
 int noOfResorts;
 String placeName;
 String location;
 
 public TouristPlaces(int typesOfFood ,int noOfPeoples ,  int noOfResorts, String placeName ,String location )
 {
 this.typesOfFood = typesOfFood;
 this.noOfPeoples = noOfPeoples;
 this.noOfResorts = noOfResorts;
 this.placeName = placeName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfFood is:" +typesOfFood);
 System.out.println("The noOfPeoples is:" + noOfPeoples);
 System.out.println("The noOfResorts is:" + noOfResorts);
 System.out.println("The placeName is:" + placeName);
 System.out.println("The location is:" + location);
 }
 }