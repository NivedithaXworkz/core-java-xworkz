class FishExecutor{
	
	public static void main(String live[]){
		Fish fish=new Fish();
		fish.setNoOfWings(2);
		fish.setFishName("Salmon");
		fish.setPrice(2500.0);
		fish.setWeight(4.5);
		
		Water water=new Water();
		water.fish=fish;
		System.out.println("The NoOfWings is: "+ water.fish.getNoOfWings());
		System.out.println("The Fish Name is : "+ water.fish.getFishName());
		System.out.println("The Fish Price is: "+ water.fish.getPrice());
		System.out.println("The Fish Weighht is : "+ water.fish.getWeight());
}
}