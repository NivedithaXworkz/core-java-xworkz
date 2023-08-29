class AppartmentExecutor {


public static void main(String a []){
	//new
	//ClassName ref = new ClassName();
	Appartment appartment = new Appartment();
	appartment.appartmentId = 1;
	appartment.appartmentName = "Prestige";
	appartment.location = "Whitefield";
	appartment.noOfFloors = 45;
	appartment.noOfTwoBhkFlats = 180;
	appartment.noOfThreeBhkFlats = 100;
	
	System.out.println("AppartmentId is "+ appartment.appartmentId);
	System.out.println("AppartmentName is"+ appartment.appartmentName);
	System.out.println("AppartmentLocation is"+ appartment.location);
	System.out.println("AppartmentisnoOdFloors"+ appartment.noOfFloors);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment.noOfTwoBhkFlats);
	System.out.println("AppartmentnoOfThreeBhkFlats"+ appartment.noOfThreeBhkFlats);
	
	appartment.provideAccomodation();
	
	Appartment appartment1 = new Appartment();
	appartment1.appartmentId = 2;
	appartment1.appartmentName = "Prestige";
	appartment1.location = "Marathahalli";
	appartment1.noOfFloors = 50;
	appartment1.noOfTwoBhkFlats = 210;
	appartment1.noOfThreeBhkFlats = 150;
	
	System.out.println("AppartmentId is "+ appartment1.appartmentId);
	System.out.println("AppartmentName is"+ appartment1.appartmentName);
	System.out.println("AppartmentLocation is"+ appartment1.location);
	System.out.println("AppartmentisnoOdFloors is"+ appartment1.noOfFloors);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment1.noOfTwoBhkFlats);
	System.out.println("AppartmentnoOfThreeBhkFlats"+ appartment1.noOfThreeBhkFlats);
	
	appartment1.provideAccomodation();
	
	
	Appartment appartment2 = new Appartment();
	appartment2.appartmentId = 2;
	appartment2.appartmentName = "Sumadhura";
	appartment2.location = "Marathahalli";
	appartment2.noOfFloors = 15;
	appartment2.noOfTwoBhkFlats = 80;
	appartment2.noOfThreeBhkFlats = 60;
	
	System.out.println("AppartmentId is "+ appartment2.appartmentId);
	System.out.println("AppartmentName is"+ appartment2.appartmentName);
	System.out.println("AppartmentLocation is"+ appartment2.location);
	System.out.println("AppartmentisnoOdFloors is"+ appartment2.noOfFloors);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment2.noOfTwoBhkFlats);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment2.noOfThreeBhkFlats);
	
	appartment2.provideAccomodation();
	
	Appartment appartment3 = new Appartment();
	appartment3.appartmentId = 2;
	appartment3.appartmentName = "Sobha Habitat";
	appartment3.location = "Hope Field";
	appartment3.noOfFloors = 12;
	appartment3.noOfTwoBhkFlats = 60;
	appartment3.noOfThreeBhkFlats = 30;
	
	System.out.println("AppartmentId is "+ appartment3.appartmentId);
	System.out.println("AppartmentName is"+ appartment3.appartmentName);
	System.out.println("AppartmentLocation is"+ appartment3.location);
	System.out.println("AppartmentisnoOdFloors is"+ appartment3.noOfFloors);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment3.noOfTwoBhkFlats);
	System.out.println("AppartmentnoOfThreeBhkFlats"+ appartment3.noOfThreeBhkFlats);
	
	appartment3.provideAccomodation();
	
	Appartment appartment4 = new Appartment();
	appartment4.appartmentId = 2;
	appartment4.appartmentName = "United Blossom";
	appartment4.location = "K R Puram";
	appartment4.noOfFloors = 20;
	appartment4.noOfTwoBhkFlats = 150;
	appartment4.noOfThreeBhkFlats = 100;
	
	System.out.println("AppartmentId is "+ appartment4.appartmentId);
	System.out.println("AppartmentName is"+ appartment4.appartmentName);
	System.out.println("AppartmentLocation is"+ appartment4.location);
	System.out.println("AppartmentisnoOdFloors is"+ appartment4.noOfFloors);
	System.out.println("AppartmentnoOfTwoBhkFlats"+ appartment4.noOfTwoBhkFlats);
	System.out.println("AppartmentnoOfThreeBhkFlats"+ appartment4.noOfThreeBhkFlats);
	
	appartment4.provideAccomodation();
	
}
}