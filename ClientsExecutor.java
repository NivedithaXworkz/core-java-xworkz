class ClientsExecutor{
	public static void main(String built[]){
		
	
	Clients clients=new Clients();
	clients.setClientName("SBI");
	clients.setWorthInCr(500);
	clients.setProduct("Banking application");
		
	Companies	companies=new Companies();
	companies.clients=clients;
	companies.companiesName="Wipro";
							
	System.out.println("The Company Name is: "+ companies.companiesName);
	System.out.println(" TheClient Name is: "+ companies.clients.getClientName());
	System.out.println("The Contarct worth in Cr is : "+ companies.clients.getWorthInCr());
	System.out.println("The Product is: "+ companies.clients.getProduct());
										
	}
}
