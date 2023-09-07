class CustomerExecutor{
 
 public static void main(String arg[]){
 
 Customer customer = new Customer();
 customer.setCustomerId(1);
 customer.getCustomerId();
 System.out.println("The customer id is :" + customer.getCustomerId());
 customer.setCustomerName("Nivi");
 customer.getCustomerName();
 System.out.println("The customer name is :" + customer.getCustomerName());
 customer.setAddress("Rajajinagar");
 customer.getAddress();
 System.out.println("The  customer address is :" + customer.getAddress());
 customer.setContactNo(976765380);
 customer.getContactNo();
 System.out.println("The  customer contactNo is :" + customer.getContactNo());
 customer.setEmail("nivi@gmail.com");
 customer.getEmail();
 System.out.println("The  customer email is :" + customer.getEmail());
 customer.setDob("22-09-2001");
 customer.getDob();
 System.out.println("The  customer dob is :" + customer.getDob());
 customer.setGender("Female");
 customer.getGender();
 System.out.println("The  customer gender is :" + customer.getGender());
 }
}