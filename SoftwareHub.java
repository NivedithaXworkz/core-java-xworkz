package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Applications;
import javafx.application.Application;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SoftwareHub {

    Applications application[];
    int id;
    public SoftwareHub(int size){
        application = new Applications[size];
    }
    int index;

    public boolean addApplication(Applications application) {
        System.out.println("invoked add applications");
        boolean isAdded = false;
        if (application != null) {
            application.setAppId(id++);
            this.application[index] = application;
            index++;
            isAdded = true;
        }

        return isAdded;

    }

    public void getAllApplication() {
        System.out.println("The list of application details are:");

        for (int i = 0; i < application.length; i++) {
            System.out.println(
                    application[i].getAppId() + " " +
                            application[i].getAppName() + " " +
                            application[i].getVersion() + " " +
                            application[i].getSizeInMb() + " " +
                            application[i].getCompanyName() + " " +
                            application[i].getAppType());

        }
    }


    public Applications getApplicationsByName(String appName) {

        Applications application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == appName) {
                application1 = application[appIndex];
                System.out.println("Applications found.....");
            }
        }
        return application1;
    }


    public Applications getApplicationsByType(String appType) {

        Applications application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() == appType) {
                application1 = application[appIndex];
                System.out.println("Applications found please collect the information");
            }
        }
        return application1;
    }

    public Applications getApplicationsById(int appId) {

        Applications application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppId() == appId) {
                application1 = application[appIndex];
                System.out.println("Applications found please collect the information");
            }
        }
        return application1;
    }

    public String getApplicationsNameByType(String appType) {

        String appName = null;
        System.out.println("invoking the method get getApplicationsNameByType");
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppType() == appType) {
                appName = application[i].getAppName();
            }
        }
        return appName;
    }

    public String getApplicationsTypeByName(String appName) {

        String appType = null;
        System.out.println("invoking the method get getApplicationsTypeByName");
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == appName) {
                appType = application[i].getAppType();
            }
        }
        return appType;
    }

    public String getApplicationsCompanyNameByName(String appName) {

        String CompanyName = null;
        System.out.println("invoking the method get getApplicationsCompanyNameByName");
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == appName) {
                CompanyName = application[i].getCompanyName();
            }
        }
        return CompanyName;
    }


    public boolean updateVersionByAppName(String updateVersion, String existingAppName) {
        boolean isversionUpdated = false;
        System.out.println("Invoking update method from updateCompanyNameByAppName");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == existingAppName) {
                application[appIndex].setVersion(updateVersion);
                isversionUpdated = true;
                System.out.println("Application found... please collect the information");
            }
        }
        return isversionUpdated;
    }



    public boolean getAllNewApplication(Application application){
     for(int i= 0; i < this.application.length; i++){
         System.out.println("application[i].getAppName() "+ "  application[i].getCompanyName()"+"  application[i].getappId()"+" application[i].getversion()"+" application[i].getreleasedDate()");
     }
     return true;
    }
    public void deleteApplicationByName(String appName) {
        System.out.println("invoked deleteApplicationByName");
        int index, newIndex;
        for ( index = 0, newIndex = 0; index < application.length-1; index++) {
            System.out.println(application[index].getAppName());
            if ( application[index].getAppName()!= appName) {
                application[newIndex] = application[index];
                System.out.println("Given app name is deleted from the software");
            }
            else{
                System.out.println("data has been deleted is"+ application[index].getAppName());
            }
        }
        application = Arrays.copyOf(application, newIndex);
        getAllApplication();
    }
}