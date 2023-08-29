class LensKartExecutor {


public static void main(String lens []){
	//new
	//ClassName ref = new ClassName();
	LensKart lensKart = new LensKart();
	lensKart.lensId = 54;
	lensKart.lensType = "Trivex lens";
	lensKart.lensColour = "Blue";
	lensKart.lensPrice = 4500;
	lensKart.lensBrand = "Prada";
	
	
	System.out.println("LensKartLensID is "+ lensKart.lensId);
	System.out.println("LensKartLensType is"+ lensKart.lensType);
	System.out.println("LensKartLensColour is"+lensKart.lensColour);
	System.out.println("LensKartLensPrice is"+ lensKart.lensPrice);
	System.out.println("LensKartLensBrand is"+ lensKart.lensBrand);
	
	lensKart.lensKartProvider();
	
	LensKart lensKart1 = new LensKart();
	lensKart1.lensId = 43;
	lensKart1.lensType = "Polycarbonate lens";
	lensKart1.lensColour = "Black";
	lensKart1.lensPrice = 3500;
	lensKart1.lensBrand = "Prada";
	
	System.out.println("LensKartLensID is "+ lensKart1.lensId);
	System.out.println("LensKartLensType is"+ lensKart1.lensType);
	System.out.println("LensKartLensColour is"+lensKart1.lensColour);
	System.out.println("LensKartLensPrice is"+ lensKart1.lensPrice);
	System.out.println("LensKartLensBrand is"+ lensKart1.lensBrand);
	
	lensKart1.lensKartProvider();
	
	LensKart lensKart2 = new LensKart();
	lensKart2.lensId = 43;
	lensKart2.lensType = "Bifocal lens";
	lensKart2.lensColour = "Black";
	lensKart2.lensPrice = 3500;
	lensKart2.lensBrand = "Silhouette";
	
	System.out.println("LensKartLensID is "+ lensKart2.lensId);
	System.out.println("LensKartLensType is"+ lensKart2.lensType);
	System.out.println("LensKartLensColour is"+lensKart2.lensColour);
	System.out.println("LensKartLensPrice is"+ lensKart2.lensPrice);
	System.out.println("LensKartLensBrand is"+ lensKart2.lensBrand);
	
	lensKart2.lensKartProvider();
	
	LensKart lensKart3 = new LensKart();
	lensKart3.lensId = 27;
	lensKart3.lensType = "Bifocal lens";
	lensKart3.lensColour = "Red";
	lensKart3.lensPrice = 3500;
	lensKart3.lensBrand = "Sharktank";
	
	System.out.println("LensKartLensID is "+ lensKart3.lensId);
	System.out.println("LensKartLensType is"+ lensKart3.lensType);
	System.out.println("LensKartLensColour is"+lensKart3.lensColour);
	System.out.println("LensKartLensPrice is"+ lensKart3.lensPrice);
	System.out.println("LensKartLensBrand is"+ lensKart3.lensBrand);
	
	lensKart3.lensKartProvider();
	
	LensKart lensKart4 = new LensKart();
	lensKart4.lensId = 27;
	lensKart4.lensType = "Trivex lens";
	lensKart4.lensColour = "White";
	lensKart4.lensPrice = 2500;
	lensKart4.lensBrand = "Airflex";
	
	System.out.println("LensKartLensID is "+ lensKart4.lensId);
	System.out.println("LensKartLensType is"+ lensKart4.lensType);
	System.out.println("LensKartLensColour is"+lensKart4.lensColour);
	System.out.println("LensKartLensPrice is"+ lensKart4.lensPrice);
	System.out.println("LensKartLensBrand is"+ lensKart4.lensBrand);
	
	lensKart4.lensKartProvider();
	
}
}