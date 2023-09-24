class Kitchen{
	private String kitchenName;
	private String cookName;
	private String dishName;
	private String typeOfDish;
	
	public Kitchen(){
		
	}
	public void setKitchenName(String kitchenName){
		this.kitchenName=kitchenName;
	}
	
	public String getKitchenName(){
		return kitchenName;
	}
	
	
	public void setCookName(String cookName){
		this.cookName=cookName;
	}
	
	public String getCookName(){
		return cookName;
	}
	
	
	public void setDishName(String dishName){
		this.dishName=dishName;
	}
	
	public String getDishName(){
		return dishName;
	}
	public void setTypeOfDish(String typeOfDish){
		this.typeOfDish=typeOfDish;
	}
	
	public String getTypeOfDish(){
		return typeOfDish;
	}
	
}