class Museum{
	
 int typesOfSculptures;
 int noOfPaintings;
 int noOfVisitors;
 String museumName;
 String location;
 
 public Museum(int typesOfSculptures ,int noOfPaintings ,  int noOfVisitors, String museumName ,String location )
 {
 this.typesOfSculptures = typesOfSculptures;
 this.noOfPaintings = noOfPaintings;
 this.noOfVisitors = noOfVisitors;
 this.museumName = museumName;
 this.location = location;
 }
 
 public void displayDetails()
 {
 System.out.println("The typesOfSculptures is:" +typesOfSculptures);
 System.out.println("The noOfPaintings is:" + noOfPaintings);
 System.out.println("The noOfVisitors is:" +  noOfVisitors);
 System.out.println("The museumName is:" + museumName);
 System.out.println("The Location is:" + location);
 }
 }