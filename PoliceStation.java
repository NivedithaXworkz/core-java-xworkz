package com.xworkz.station;

import com.xworkz.officer.Officer;

import java.util.Arrays;

public class PoliceStation {

    Officer officers[] ;

    public PoliceStation(int size){
        officers = new Officer[size];
    }


    int index;
    public boolean addOfficers(Officer officer) {
        System.out.println("invoked add officer");
        boolean isAdded = false;
        if (officer != null) {
            this.officers[index] = officer;
            index++;
            isAdded = true;
        }
        return isAdded;
    }
    public void getAllOfficer(){
        System.out.println("Officer lists are");
        for(int index = 0; index< officers.length; index++){
            System.out.println(officers[index].getOfficerId()+" "+ officers[index].getName()+" "+ officers[index].getAge()+" "+officers[index].getPostName()+" " +officers[index].getAddress()+""+officers[index].getBloodGroup());
        }
    }
    public String getAddressById(int id){
        String address = null ;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++)
        {
            if (officers[officerIndex].getOfficerId() == id)
            {
                address = officers[officerIndex].getAddress();
                System.out.println("Application  name found.... please collect it in executor");
            }
        }
        return address;
    }

    public Officer getOfficeInfoById(String officerName){
        Officer officer1 = null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if ( officers[officerIndex].getName() == officerName ){
                officer1 = officers[officerIndex];
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return officer1;
    }
    public int getOfficerAgeByName(String officerName){
        int age = 0;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if ( officers[officerIndex].getName() == officerName ){
                age = officers[officerIndex].getAge();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return age;
    }
    public String getPostNameByName(String officerName){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if ( officers[officerIndex].getName() == officerName ){
                postName = officers[officerIndex].getPostName();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return postName;
    }
    public String getPostNameById(int officerId){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if ( officers[officerIndex].getOfficerId() == officerId ){
                postName = officers[officerIndex].getPostName();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return postName;
    }
    public boolean updatePostNameByOfficerName(String updatedPostName, String exisistingOfficerName){
        boolean isPostNameUpdated = false ;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if ( officers[officerIndex].getName() == exisistingOfficerName ){
                officers[officerIndex].setPostName(updatedPostName);
                isPostNameUpdated = true;
            }
        }
        return isPostNameUpdated;
    }
    public void deleteOfficerById(int id) {
        System.out.println("invoked deleteOfficerById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.officers.length; index++) {
            if (officers[index].getOfficerId() != id) {
                officers[newIndex++] = officers[index];
            }
            else {
                System.out.println("Given App Name is been deleted from the SoftwareHub");
            }
        }
                   // java.util
        officers = Arrays.copyOf(officers, newIndex);
        getAllNewApplication(officers);
    }
    public void getAllNewApplication(Officer application[]){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(officers[index].getOfficerId()+" "+officers[index].getName()+" "+officers[index].getGender()+" "+officers[index].getAge()+" "+officers[index].getPostName()+" "+officers[index].getBloodGroup()+" "+officers[index].getAddress());
        }
    }
}









