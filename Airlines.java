class Airlines{
	
 int airlinesId;
 int noOfTerminals;
 int typesOfFood;
 String airlineCompany;
 String destination;
 
 public Airlines(int airlinesId ,int noOfTerminals , int typesOfFood, String airlineCompany ,String destination )
 {
 this.airlinesId = airlinesId;
 this.noOfTerminals = noOfTerminals;
 this.typesOfFood = typesOfFood;
 this.airlineCompany = airlineCompany;
 this.destination = destination;
 }
 
 public void displayDetails()
 {
 System.out.println("The airlinesId is:" +airlinesId);
 System.out.println("The noOfTerminals is:" + noOfTerminals);
 System.out.println("The typesOfFood is:" + typesOfFood );
 System.out.println("The airlineCompany is:" + airlineCompany);
 System.out.println("The Destination is:" + destination);
 }
 }