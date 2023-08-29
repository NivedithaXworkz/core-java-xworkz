class ChainExecutor {


public static void main(String fashion []){
	//new
	//ClassName ref = new ClassName();
	Chain chain = new Chain();
	chain.chainId = 1;
	chain.chainColour = "Gold";
	chain.chainBrand = "Royatto";
	chain.chainMaterial = "Copper";
	chain.chainPrice = 180;
	
	
	System.out.println("ChainId is "+ chain.chainId);
	System.out.println("ChainColour is"+ chain.chainColour);
	System.out.println("ChainBrand is"+ chain.chainBrand);
	System.out.println("ChainMaterial is"+ chain.chainMaterial);
	System.out.println("ChainPrice is"+ chain.chainPrice);
	
	
	chain.provideFashion();
	
	Chain chain1 = new Chain();
	chain1.chainId = 4;
	chain1.chainColour = "Silver";
	chain1.chainBrand = "DMJ";
	chain1.chainMaterial = "Copper";
	chain1.chainPrice = 140;
	
	System.out.println("ChainId is "+ chain1.chainId);
	System.out.println("ChainColour is"+ chain1.chainColour);
	System.out.println("ChainBrand is"+ chain1.chainBrand);
	System.out.println("ChainMaterial is"+ chain1.chainMaterial);
	System.out.println("ChainPrice is"+ chain1.chainPrice);
	
	
	chain1.provideFashion();
	
	Chain chain2 = new Chain();
	chain2.chainId = 4;
	chain2.chainColour = "Silver";
	chain2.chainBrand = "Royatto";
	chain2.chainMaterial = "Brass";
	chain2.chainPrice = 140;
	
	System.out.println("ChainId is "+ chain2.chainId);
	System.out.println("ChainColour is"+ chain2.chainColour);
	System.out.println("ChainBrand is"+ chain2.chainBrand);
	System.out.println("ChainMaterial is"+ chain2.chainMaterial);
	System.out.println("ChainPrice is"+ chain2.chainPrice);
	
	
	chain2.provideFashion();
	
	Chain chain3 = new Chain();
	chain3.chainId = 6;
	chain3.chainColour = "Silver";
	chain3.chainBrand = "Royatto";
	chain3.chainMaterial = "Copper";
	chain3.chainPrice = 530;
	
	System.out.println("ChainId is "+ chain3.chainId);
	System.out.println("ChainColour is"+ chain3.chainColour);
	System.out.println("ChainBrand is"+ chain3.chainBrand);
	System.out.println("ChainMaterial is"+ chain3.chainMaterial);
	System.out.println("ChainPrice is"+ chain3.chainPrice);
	
	
	chain3.provideFashion();
	
	Chain chain4 = new Chain();
	chain4.chainId = 6;
	chain4.chainColour = "Silver";
	chain4.chainBrand = "Royatto";
	chain4.chainMaterial = "Copper";
	chain4.chainPrice = 530;
	
	System.out.println("ChainId is "+ chain4.chainId);
	System.out.println("ChainColour is"+ chain4.chainColour);
	System.out.println("ChainBrand is"+ chain4.chainBrand);
	System.out.println("ChainMaterial is"+ chain4.chainMaterial);
	System.out.println("ChainPrice is"+ chain4.chainPrice);
	
	
	chain4.provideFashion();
	
}
}