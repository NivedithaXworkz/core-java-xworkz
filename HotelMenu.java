class HotelMenu {

    String menuItems[] = new String[10];
    int index;

    // Method to add a menu item and its price to the arrays
    public boolean addMenuItem(String menuItem) {
        boolean isAdded = false;
		if(index<menuItems.length){
        if (menuItem != null) {
			boolean exists = checkIfMenuItemExists(menuItem);
		      if(exists == false)
			  {
            menuItems[index] = menuItem;
            index++;
            isAdded = true;
              }
		else {
			 System.out.println(menuItem + " is already exist");
		    }
		   
		   }
		}
		else{
			System.out.println("items are filled you cannot proceed to add");;
		}
        return isAdded;
    }

   //read
    public void displayMenu() {
        System.out.println("Hotel Menu:");
        for (int index = 0; index < menuItems.length; index++) {
            System.out.println(menuItems[index]);
        }
    }
	
	public boolean checkIfMenuItemExists(String menuItem)
		{
			boolean exists=false;
	      for(int index=0;index<menuItems.length;index++)
	       {
		  
			   if (menuItems[index]==menuItem)
			   {
			    exists=true;
			   }
		   
	       }
		     return exists;
        }
		
		
		
		// Search for a MenuItem
	public String searchByMenuItem( String menuItem)
		{      
			for(int i=0;i<menuItems.length;i++)
			{
				if(menuItems[i]==menuItem)
					  return menuItem;
			}
			 return null;
		}
public void getMenuItems()
	{
		System.out.println("The list of Menu names are :");
		for(int index=0; index < menuItems.length;index++)
		{
			System.out.println(menuItems[index]);
		}
		
	}
	
String menuItemsAfterDelete[] = new String[menuItems.length-1];

	
	public boolean deletedByMenuItems(String menuItem){
	boolean isDeleted = false;
	int ind = 0;
	 for(int index=0; index< menuItems.length; index++){
		 
		 if(menuItems[index]!= menuItem){
	menuItemsAfterDelete[ind++]= menuItems[index];
		 isDeleted = true;

		 }
	 }
	 return isDeleted;
}	

public void getDeletedMenuItems(){
	System.out.println("List of menuItems After Deleted are: ");
	 for(int index=0; index< menuItemsAfterDelete.length; index++){
		 System.out.println(menuItemsAfterDelete[index]);
}

}

}
 

