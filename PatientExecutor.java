class PatientExecutor{
	public static void main(String fever[]){
		
	Patient patient=new Patient();
	patient.setPatientId(50);
	patient.setPatientName("Ramya");
	patient.setDiseases("Job Fever");
	patient.setAge(25);
	
		
	Hospital hospital=new Hospital();
	hospital.patient=patient;
	hospital.hospitalName="Apollo Hospital";						
	System.out.println("The Hospital Name is : "+ hospital.hospitalName);
	System.out.println("The Patient Id is : "+ hospital.patient.getPatientId());
	System.out.println("The Patient Name is: "+ hospital.patient.getPatientName());
	System.out.println("The Diseases is: "+ hospital.patient.getDiseases());
	System.out.println("The Age is : "+ hospital.patient.getAge());
							
	}
}
