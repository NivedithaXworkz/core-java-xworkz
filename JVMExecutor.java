class JVMExecutor{
	public static void main(String programming[]){
		
	
	JVM jvm=new JVM();
	jvm.setPurpose("which provides runtime environment for bytecode");
	jvm.setVersion("java 21");
	jvm.setPlatform("Java platform-independent");
		
	Java java=new Java();
	java.jvm=jvm;
	java.hostCompanyName="Sun Microsystems";							
	System.out.println("The Hosting Company Name is: "+ java.hostCompanyName);
	System.out.println("The Purpose is: "+ java.jvm.getPurpose());
	System.out.println("The Version is: "+ java.jvm.getVersion());
	System.out.println("The Platfrom is: "+ java.jvm.getPlatform());
							
	}
}
