class Zoo{
	
 int typesOfBirds;
 int typesOfAnimals;
 int noOfShops;
 String zooName;
 String location;
 
 public Zoo(int typesOfBirds ,int typesOfAnimals , int noOfShops, String zooName ,String location )
 {
 this.typesOfBirds = typesOfBirds;
 this.typesOfAnimals = typesOfAnimals;
 this.noOfShops = noOfShops;
 this.zooName = zooName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfBirds is:" +typesOfBirds);
 System.out.println("The typesOfAnimals is:" + typesOfAnimals);
 System.out.println("The noOfShops is:" + noOfShops);
 System.out.println("The zooName is:" + zooName);
 System.out.println("The Location is:" + location);
 }
 }