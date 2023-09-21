class HotelMenuExecutor{
  
     public static void main(String hotelmenu[]) {
        // Create an instance of Hotel
        HotelMenu hotelMenu = new HotelMenu();
        hotelMenu.addMenuItem("Masaldose");
        hotelMenu.addMenuItem("Paneer sandwich");
        hotelMenu.addMenuItem("Egg rice");
        hotelMenu.addMenuItem("Prawns");
        hotelMenu.addMenuItem("chilly chicken");
        hotelMenu.addMenuItem("Egg rice");
        hotelMenu.addMenuItem("Dal fry");
		hotelMenu.addMenuItem("Prawns");
        hotelMenu.addMenuItem("Fish kabab");
        hotelMenu.addMenuItem("Motton");
         hotelMenu.addMenuItem("Motton biriyani");
         hotelMenu.addMenuItem("Motton kabab");


        // Display the menu
        hotelMenu.displayMenu();
		
		String menuItem="Paneer sandwich";
		System.out.println("Searching for the menu item " +menuItem);
		String item=hotelMenu.searchByMenuItem(menuItem);
		System.out.println(item +" is found! thank you searching. " );
		
  boolean deletedMenuItem=hotelMenu.deletedByMenuItems("Motton");
System.out.println("The Motton menu is deleted :"  + deletedMenuItem);
hotelMenu.getDeletedMenuItems();

}
}