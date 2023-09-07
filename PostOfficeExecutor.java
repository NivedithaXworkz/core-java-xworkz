class PostOfficeExecutor{
 
 public static void main(String args[]){
 PostOffice post = new PostOffice(); 
 post.setOfficeId(6);
 post.getOfficeId();
 System.out.println("The office id is :" + post.getOfficeId());
 
 post.setOfficeName("Anekal");
 post.getOfficeName();
 System.out.println("The office name is :" + post.getOfficeName());
 
 post.setOfficeEmail("post12@gmail.com");
 post.getOfficeEmail();
 System.out.println("The office email is :" + post.getOfficeEmail());
 
 post.setManagerName("Satish");
 post.getManagerName();
 System.out.println("The manager name is :" + post.getManagerName());
 
  post.setLocation("Mysore");
 post.getLocation();
 System.out.println("The location is :" + post.getLocation());
 }
 }