class Library{
	
 int libId;
 int noOfClerks;
 int noOfRacks;
 String libName;
 int noOfBooks;
 
 public Library(int libId ,int noOfClerks , int noOfRacks, String libName ,int noOfBooks )
 {
 this.libId= libId;
 this.noOfClerks = noOfClerks;
 this.noOfRacks = noOfRacks;
 this.libName = libName;
 this.noOfBooks = noOfBooks;
 }
 
 public void displayDetails()
 {
 System.out.println("The libId is:" +libId);
 System.out.println("The noOfClerks is:" + noOfClerks);
 System.out.println("The noOfRacks is:" + noOfRacks);
 System.out.println("The libName is:" + libName);
 System.out.println("The noOfBooks is:" + noOfBooks);
 }
 }