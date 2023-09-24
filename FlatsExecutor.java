class FlatsExecutor{
	public static void main(String stay[]){
		
	
	Flats flats=new Flats();
	flats.setFlatId("AS");
	flats.setNoOfDoors(2);
	flats.setNoOfWindows(6);
		
	Apartments	apartments=new Apartments();
	apartments.flats=flats;
	
	apartments.apartmentName="Kamath Apartments";
								
		System.out.println("Apartment Name : "+ apartments.apartmentName);
		System.out.println("Flat Id : "+ apartments.flats.getFlatId());
		System.out.println("No of Doors : "+ apartments.flats.getNoOfDoors());
		System.out.println("No of Windows : "+ apartments.flats.getNoOfWindows());
									

	}
}
