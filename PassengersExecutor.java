class PassengersExecutor{
	public static void main(String[] travel){
		Passengers passengers=new Passengers();
		passengers.setPassengerName("Nivi");
		passengers.setPassengerId(46563);
		passengers.setAge(25);
		passengers.setDestination("Mumbai");
		
        Train train= new Train();
		train.passengers=passengers;
		train.managedBy = "Driver";
		System.out.println("The PassengerName is :" + train.passengers.getPassengerName());
		System.out.println("The Age is :"+ train.passengers.getAge());
		System.out.println("The PassengerId is :"+ train.passengers.getPassengerId());
		System.out.println("The Destination is :" + train.passengers.getDestination());
		System.out.println("The  Trian is Managed by :" + train.managedBy);
}
}
