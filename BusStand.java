class BusStand{
private int busNo;
private String busName;
private String destination;
private int noOfPassengers;
private int noOfFoodCourt;

public void setBusNo(int busNo){
  this.busNo = busNo;
  }
  public int getBusNo(){
  return busNo;
  }
  
  public void setBusName(String busName){
  this.busName = busName;
  }
 public String getBusName(){
  return busName;
  }
  
  public void setDestination(String destination){
  this.destination = destination;
  }
 public String getDestination(){
  return destination;
  }
  
  public void setNoOfPassengers(int noOfPassengers){
  this.noOfPassengers = noOfPassengers;
  }
  public int getNoOfPassengers(){
  return noOfPassengers;
  }
  
  public void setNoOfFoodCourt(int noOfFoodCourt){
  this.noOfFoodCourt = noOfFoodCourt;
  }
  public int getNoOfFoodCourt(){
  return noOfFoodCourt;
  }
  }