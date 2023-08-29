class FastrackExecutor {


public static void main(String watch []){
	//new
	//ClassName ref = new ClassName();
	Fastrack fastrack = new Fastrack();
	fastrack.productId = 54;
	fastrack.productType = "Analog";
	fastrack.productColour = "Blue";
	fastrack.productPrice = 2500;
	fastrack.productBrand = "Quartz";
	
	
	System.out.println("ProductID is "+ fastrack.productId);
	System.out.println("ProductType is"+ fastrack.productType);
	System.out.println("ProductColour is"+fastrack.productColour);
	System.out.println("ProductPrice is"+ fastrack.productPrice);
	System.out.println("ProductBrand is"+ fastrack.productBrand);
	
	fastrack.provideWatch();
	
	Fastrack fastrack1 = new Fastrack();
	fastrack1.productId = 54;
	fastrack1.productType = "Digital";
	fastrack1.productColour = "Black";
	fastrack1.productPrice = 2000;
	fastrack1.productBrand = "Quartz";
	
	System.out.println("ProductID is "+ fastrack1.productId);
	System.out.println("ProductType is"+ fastrack1.productType);
	System.out.println("ProductColour is"+fastrack1.productColour);
	System.out.println("ProductPrice is"+ fastrack1.productPrice);
	System.out.println("ProductBrand is"+ fastrack1.productBrand);
	
	fastrack1.provideWatch();
	
	Fastrack fastrack2 = new Fastrack();
	fastrack2.productId = 54;
	fastrack2.productType = "Digital";
	fastrack2.productColour = "Brown";
	fastrack2.productPrice = 2260;
	fastrack2.productBrand = "Quartz";
	
	System.out.println("ProductID is "+ fastrack2.productId);
	System.out.println("ProductType is"+ fastrack2.productType);
	System.out.println("ProductColour is"+fastrack2.productColour);
	System.out.println("ProductPrice is"+ fastrack2.productPrice);
	System.out.println("ProductBrand is"+ fastrack2.productBrand);
	
	fastrack2.provideWatch();
	
	Fastrack fastrack3 = new Fastrack();
	fastrack3.productId = 25;
	fastrack3.productType = "Analog";
	fastrack3.productColour = "Brown";
	fastrack3.productPrice = 2260;
	fastrack3.productBrand = "Quartz";
	
	System.out.println("ProductID is "+ fastrack3.productId);
	System.out.println("ProductType is"+ fastrack3.productType);
	System.out.println("ProductColour is"+fastrack3.productColour);
	System.out.println("ProductPrice is"+ fastrack3.productPrice);
	System.out.println("ProductBrand is"+ fastrack3.productBrand);
	
	fastrack3.provideWatch();
	
	Fastrack fastrack4 = new Fastrack();
	fastrack4.productId = 25;
	fastrack4.productType = "Analog";
	fastrack4.productColour = "Brown";
	fastrack4.productPrice = 2260;
	fastrack4.productBrand = "Quartz";
	
	System.out.println("ProductID is "+ fastrack4.productId);
	System.out.println("ProductType is"+ fastrack4.productType);
	System.out.println("ProductColour is"+fastrack4.productColour);
	System.out.println("ProductPrice is"+ fastrack4.productPrice);
	System.out.println("ProductBrand is"+ fastrack4.productBrand);
	
	fastrack4.provideWatch();
	
}
}