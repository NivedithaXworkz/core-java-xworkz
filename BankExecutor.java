class BankExecutor{
 
 public static void main(String arg[]){
 Bank bank = new Bank();
 bank.setBankId(1);
 bank.getBankId();
 System.out.println("The bank id is :" + bank.getBankId());
 
 bank.setBankName("Canara");
 bank.getBankName();
 System.out.println("The bank name is :" + bank.getBankName());
 
 bank.setBankEmail("canara12@gmail.com");
 bank.getBankEmail();
 System.out.println("The bank email is :" + bank.getBankEmail());
 
 bank.setNoOfWorkers(5);
 bank.getNoOfWorkers();
 System.out.println("The noOfWorkers is :" + bank.getNoOfWorkers());
 
 bank.setManagerName("Suresh");
 bank.getManagerName();
 System.out.println("The manager name is :" + bank.getManagerName());
 
 bank.setBranchName("Hassan");
 bank.getBranchName();
 System.out.println("The branch name is :" + bank.getBranchName());
 }
 }