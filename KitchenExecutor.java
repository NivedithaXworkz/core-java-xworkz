class KitchenExecutor{
	
	public static void main(String food[]){
		Kitchen kitchen=new Kitchen();
		kitchen.setKitchenName("Nivi kitchen ");
		kitchen.setCookName("Niveditha");
		kitchen.setDishName("Chilly Chicken");
		kitchen.setTypeOfDish("Spicy");
		
		Hotel hotel=new Hotel();
		hotel.kitchen=kitchen;
		hotel.hotelName="Zomato kitchen";
		
		System.out.println("The Hotel Name is: "+ hotel.hotelName);				
		System.out.println("The Kitchen Name is : "+ hotel.kitchen.getKitchenName());
		System.out.println("The Kitchen Cook Name is: "+ hotel.kitchen.getCookName());
		System.out.println("The Dish Cooked in Kitchen is: "+ hotel.kitchen.getDishName());
		System.out.println("The Type of Dish is: "+ hotel.kitchen.getTypeOfDish());
					
	}
}