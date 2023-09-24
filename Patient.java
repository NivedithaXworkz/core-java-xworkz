class Patient{
	private  int patientId;
	private String patientName;
	private String diseases;
	private int age;
	
	public Patient(){
		
	}
	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	
	public int getPatientId(){
		return patientId;
	}
	
	
	public void setPatientName(String patientName){
		this.patientName=patientName;
	}
	
	public String getPatientName(){
		return patientName;
	}
	public void setDiseases(String diseases){
		this.diseases=diseases;
	}
	
	public String getDiseases(){
		return diseases;
	}
	
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	
}