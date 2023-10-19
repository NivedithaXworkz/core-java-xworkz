package com.xworkz.playstoreapp;


import com.xworkz.playstoreapp.application.Applications;
import com.xworkz.playstoreapp.hub.SoftwareHub;
import javafx.stage.Stage;

import java.util.Scanner;

public class AppExecutor {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of applications  to be added");
  int size = sc.nextInt();
  SoftwareHub softwareHub = new SoftwareHub(size);

  for (int index = 0; index < size; index++) {
   Applications application = new Applications();
  // System.out.println("Enter the app Id");//
  // application.setAppId(sc.nextInt());//
   System.out.println("enter the app name");
   application.setAppName(sc.next());
   System.out.println("enter the version");
   application.setVersion(sc.next());
   System.out.println("enter the company name");
   application.setCompanyName(sc.next());
   System.out.println("enter the size");
   application.setSizeInMb(sc.nextInt());
   softwareHub.addApplication(application);
  }
  String input = null;
  do {
   System.out.println("press 1 : to get AllApplication");
   System.out.println("press 2 : to get ApplicationsByName ");
   System.out.println("press 3 : to get ApplicationsByType");
   System.out.println("press 4 : to get ApplicationsById");
   System.out.println("press 5 : to get ApplicationsNameByType");

   int options = sc.nextInt();

   switch (options) {
    case 1:
     System.out.println("enter all application");
     softwareHub.getAllApplication();
     break;
    case 2:
     System.out.println("enter get ApplicationsByName");
     softwareHub.getApplicationsByName(sc.next());
     break;
    case 3:
     System.out.println("enter get ApplicationsByType");
      softwareHub.getApplicationsByType(sc.next());
     break;
    case 4:
     System.out.println("enter get ApplicationsById");
      softwareHub.getApplicationsById(sc.nextInt());
     break;
    case 5:
     System.out.println("enter get ApplicationsNameByType");
     softwareHub.getApplicationsNameByType(sc.next());
     break;
   }
   System.out.println("do u want to continue Y/N");
   input = sc.next();
  }
  while (input.equals("Y"));
  System.out.println("thank you for using this app.....");
 }
}



 /* Applications app1 = new Applications();
  app1.setAppId(2);
  app1.setAppName("Snapchat");
  app1.setSizeInMb(500);
  app1.setVersion("2.3");
  app1.setReleasedDate("8-7-2021");
  app1.setCompanyName("SnapInc");
  app1.setAppType("socialMedia");

  Applications app2 = new Applications();
  app2.setAppId(3);
  app2.setAppName("Insta");
  app2.setSizeInMb(300);
  app2.setVersion("2.5");
  app2.setReleasedDate("9-7-2021");
  app2.setCompanyName("Meta");
  app2.setAppType("socialMedia");

  SoftwareHub softwareHub = new SoftwareHub();

  softwareHub.addApplication(application);
  softwareHub.addApplication(app1);
   softwareHub.getAllApplication();


  softwareHub.updateVersionByAppName("3.2" , "Snapchat");

  softwareHub.getAllApplication();

   Applications appByName = softwareHub.getApplicationsByName("Whats app");
  System.out.println(appByName.getAppId() + " " + appByName.getAppName() + " " + appByName.getVersion() + " " + appByName.getCompanyName() + " " + appByName.getSizeInMb());

  Applications appByType = softwareHub.getApplicationsByType("socialMedia");
  System.out.println(appByType.getAppId() + " " + appByType.getAppType() + " " + appByType.getVersion() + " " + appByType.getCompanyName() + " " + appByType.getSizeInMb() + " " + appByType.getReleasedDate() + " " + appByType.getAppType());

  Applications appById = softwareHub.getApplicationsById(1);
  System.out.println(appById.getAppId() + " " + appById.getAppName() + " " + appById.getVersion() + " " + appById.getCompanyName() + " " + appById.getSizeInMb());

  String appName = softwareHub.getApplicationsNameByType("socialMedia");
  System.out.println("App Name is fetched by the type:"+ appName);

  String appType = softwareHub.getApplicationsTypeByName("Whats app");
  System.out.println("App Type is fetched by the name:"+ appType);

  String CompanyName  = softwareHub.getApplicationsCompanyNameByName("Snapchat");
  System.out.println(" CompanyName is fetched by the name:"+ CompanyName);

  SoftwareHub softwareHub = new SoftwareHub();

  softwareHub.addApplication(application);
  softwareHub.addApplication(app1);
  SoftwareHub softwarehub = new SoftwareHub();

  softwarehub.addApplication(application);
  softwarehub.addApplication(app1);
  softwarehub.addApplication(app2);

  softwarehub.getAllApplication();

  softwarehub.deleteApplicationByName("Whats app");*/


