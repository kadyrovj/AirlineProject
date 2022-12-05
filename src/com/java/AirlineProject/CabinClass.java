package com.java.AirlineProject;

import java.util.Scanner;

public class CabinClass {
    Scanner sc = new Scanner(System.in);
    String userCabinClass = checkEnteredClass(sc);

    public String selectedCabinClass (String userCabinClass){
        double ticketPrice;
        double economyPrice = 0.0;
        double businessPrice = 0.3;

        if (userCabinClass.equalsIgnoreCase("economy")) {
            ticketPrice = economyPrice;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + " CLASS" + ". \nYour total price is " + ticketPrice);
        } else if (userCabinClass.equalsIgnoreCase("business")) {
            ticketPrice = economyPrice * businessPrice + economyPrice;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + " CLASS" + ". \nYour total price is " + ticketPrice);
        } else if (userCabinClass.equalsIgnoreCase("first class")) {
            ticketPrice = economyPrice * 2;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + ". \nYour total price is " + ticketPrice);
        }
        return userCabinClass;
    }

    public boolean wrongClass(String userCabinClass){
        if(userCabinClass.equalsIgnoreCase("economy") || userCabinClass.equalsIgnoreCase("business") || userCabinClass.equalsIgnoreCase("first class")){
            return true;
        }else{
            System.out.println("You have entered a non-existent Cabin Class. Please try again.");
            return false;
        }
    }
    public String checkEnteredClass(Scanner sc){
        System.out.println("Please choose a type of cabin class.");
        System.out.println("Enter one of the following: Economy, Business, or First Class.");
        String userCabinClass = sc.nextLine();
        while(!wrongClass(userCabinClass)) {
            userCabinClass=sc.nextLine();
        }
        return userCabinClass;
    }
}