package com.java.AirlineProject;

import java.util.Scanner;

public class Karina {
    Check ch = new Check();
    Scanner sc = new Scanner(System.in);
    String userCabinClass;

    public double selectedCabinClass (double ticketPrice){ //destinations are needed to determine the ticket price
        userCabinClass = checkEnteredClass(sc);
        double economyPrice = 1.0;
        double businessPrice = 1.3;
        double firstClassPrice = 2.0;

        if (userCabinClass.equalsIgnoreCase("economy")) {
            ticketPrice = ticketPrice*economyPrice;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + " CLASS" + ".");
        } else if (userCabinClass.equalsIgnoreCase("business")) {
            ticketPrice = ticketPrice * businessPrice;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + " CLASS" + ".");
        } else if (userCabinClass.equalsIgnoreCase("first class")) {
            ticketPrice = ticketPrice * firstClassPrice;
            System.out.println("Thank you for choosing " + userCabinClass.toUpperCase() + ".");
        }
        return ticketPrice;
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
        System.out.println("\nPlease choose a type of cabin class:");
        System.out.println("Enter one of the following: Economy, Business, or First Class.");
        String userCabinClass = ch.checkName(sc);
        while(!wrongClass(userCabinClass)) {
            userCabinClass=ch.checkName(sc);
        }
        return userCabinClass;
    }
}