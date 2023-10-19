package com.xworkz.station;

import com.xworkz.officer.Officer;

import java.util.Scanner;


public class StationExecutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Officer's to be added");
        int size = sc.nextInt();
        PoliceStation policeStation = new PoliceStation(size);

        for (int index = 0; index < size; index++) {
            Officer officers = new Officer();
            System.out.println("Enter the Officer's Id");

            officers.setOfficerId(sc.nextInt());
            System.out.println("Enter the Name of the Officer");
            officers.setName(sc.next());
            System.out.println("Enter the Posting name");
            officers.setPostName(sc.next());
            System.out.println("Enter the age of the Officer");
            officers.setAge(sc.nextInt());
            System.out.println("Enter the Gender");
            officers.setGender(sc.next());
            System.out.println("Enter the Blood Group");
            officers.setBloodGroup(sc.next());
            System.out.println("Enter the Address of the officer");
            officers.setAddress(sc.next());
            policeStation.addOfficers(officers);
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
                    System.out.println("enter all Officer");
                    policeStation.getAllOfficer();
                    break;
                case 2:
                    System.out.println("enter get OfficeInfoById");
                    policeStation.getOfficeInfoById(sc.next());
                    break;
                case 3:
                    System.out.println("enter get OfficerAgeByName");
                    policeStation.getOfficerAgeByName(sc.next());
                    break;
                case 4:
                    System.out.println("enter get PostNameByName");
                    policeStation.getPostNameByName(sc.next());
                    break;
                case 5:
                    System.out.println("enter get PostNameById");
                    policeStation.getPostNameById(sc.nextInt());
                    break;
            }
            System.out.println("do u want to continue Y/N");
            input = sc.next();
        }
        while (input.equals("Y"));
        System.out.println("thank you");
    }




//policeStation.getAllOfficer();
    //

/*
            String address = policeStation.getAddressById(2);
            System.out.println(address);

            Officer offic = policeStation.getOfficeInfoById(sc.next());
            System.out.println(offic.getOfficerId()+" "+offic.getName()+" "+offic.getGender()+" "+offic.getAge()+" "+offic.getPostName()+" "+offic.getAddress()+" "+offic.getBloodGroup());

            int age = policeStation.getOfficerAgeByName("Niveditha");
            System.out.println(age);

            String postName = policeStation.getPostNameByName("Sagar");
            System.out.println(postName);

            String postName1 = policeStation.getPostNameById(5);
            System.out.println(postName1);

            policeStation.updatePostNameByOfficerName("SP","Sagar");

            policeStation.deleteOfficerById(4);
*/

            }














