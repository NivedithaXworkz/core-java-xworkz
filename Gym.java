class Gym{
	
 int typesOfExercise;
 int noOfPeoples;
 int noOfEquipments;
 String gymName;
 String location;
 
 public Gym(int typesOfExercise ,int noOfPeoples ,  int noOfResorts, String placeName ,String location )
 {
 this.typesOfExercise = typesOfExercise;
 this.noOfPeoples = noOfPeoples;
 this.noOfEquipments = noOfEquipments;
 this.gymName = gymName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfExercise is:" +typesOfExercise);
 System.out.println("The noOfPeoples is:" + noOfPeoples);
 System.out.println("The noOfEquipments is:" + noOfEquipments);
 System.out.println("The gymName is:" + gymName);
 System.out.println("The location is:" + location);
 }
 }