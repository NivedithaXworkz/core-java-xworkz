class RefillExecutor {
	public static void main(String write[]){
		
	Refill refill=new Refill();
	refill.setRefillName("Reynolds");
	refill.setColour("Black");
	refill.setType("Normal");
		
	Pen pen=new Pen();
	pen.refill=refill;
	
	pen.penName="Nataraja Pen";
							
	System.out.println("The Pen Name is:"+ pen.penName);
	System.out.println("The Refill Name is: "+ pen.refill.getRefillName());
	System.out.println("The Refill colour is: "+ pen.refill.getColour());
	System.out.println("The Refill type is : "+ pen.refill.getType());
										
	}
}
