class ApplicationExecutor{

public static void main(String apps[]){

Application app = new Application();
app.setName("phone pe");
app.setSizeInMb(250);
app.setVersion("5.1.1 apk");
app.setRatings("4.5");
app.setNoOfDownloads("1,000");
app.setComapanyName("private limited");

PlayStore store = new PlayStore();
store.application = app;
store.managedBy = "Google";
System.out.println(store.application.getName());
System.out.println(store.application.getSizeInMb());
System.out.println(store.application.getVersion());
System.out.println(store.application.getRatings());
System.out.println(store.application.getNoOfDownloads());
System.out.println(store.application.getComapanyName());
System.out.println(store.managedBy);
}
}



