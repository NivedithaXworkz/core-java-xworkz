class SoilExecutor {
    public static void main(String[] plantgrowth) {
        Soil soil = new Soil();
        soil.setSoilName("Clay");
        soil.setMoisture("45% to 50%");
        soil.setMinerals("silica, alumina, and water");

        Plant plant = new Plant();
        plant.soil = soil;
        plant.plantName = "Cabbage";
							
    System.out.println("The Plant Name is: " + plant.plantName);
    System.out.println("The Soil Name is: " + plant.soil.getSoilName());
    System.out.println("The Moisture is: " + plant.soil.getMoisture());
    System.out.println("The Minerals is: " + plant.soil.getMinerals());
								
    }
}