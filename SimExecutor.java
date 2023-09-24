class SimExecutor {
    public static void main(String call[]) {
        Sim sim = new Sim();
        sim.setSimName("Airtel");
        sim.setNumber(7019084193L);
        sim.setDatapack("5GB 749 rs");
        sim.setPrice(500);

        CellPhone cellPhone = new CellPhone();
        cellPhone.sim = sim;
        cellPhone.cellphoneName = "Samsung";
	    					
        System.out.println("The Cellphone Name is: " + cellPhone.cellphoneName);
        System.out.println("The SIM Nameis: " + cellPhone.sim.getSimName());
        System.out.println("The SIM Number is: " + cellPhone.sim.getNumber());
        System.out.println("The Data Packis: " + cellPhone.sim.getDatapack());
        System.out.println("The Price is: " + cellPhone.sim.getPrice());
									
    }
}