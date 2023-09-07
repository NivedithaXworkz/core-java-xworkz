class Forest{
	
 int typesOfPlants;
 int noOfAnimals;
 int noOfRivers;
 String forestName;
 String location;
 
 public Forest(int typesOfPlants ,int noOfAnimals , int noOfRivers, String forestName ,String location )
 {
 this.typesOfPlants = typesOfPlants;
 this.noOfAnimals = noOfAnimals;
 this.noOfRivers = noOfRivers;
 this.forestName = forestName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfPlants is:" +typesOfPlants);
 System.out.println("The noOfAnimals is:" + noOfAnimals);
 System.out.println("The noOfRivers is:" + noOfRivers);
 System.out.println("The Forestname is:" + forestName);
 System.out.println("The Location is:" + location);
 }
 }