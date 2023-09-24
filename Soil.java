class Soil {
    private String soilName;
    private String moisture;
    private String minerals;

    public Soil() {

    }

    public void setSoilName(String soilName) {
        this.soilName = soilName;
    }
    public String getSoilName() {
        return soilName;
    }
	
    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }
    public String getMoisture() {
        return moisture;
    }

    public void setMinerals(String minerals) {
        this.minerals = minerals;
    }
    public String getMinerals() {
        return minerals;
    }
}