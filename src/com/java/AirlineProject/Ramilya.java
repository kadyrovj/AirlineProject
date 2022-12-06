package com.java.AirlineProject;


import java.time.LocalDate;
import java.util.Scanner;

public class Ramilya extends DataBase {
    Scanner sc = new Scanner(System.in);
    Check ch = new Check();
    Marina mr = new Marina();
    //DataBase db = new DataBase();


    public double getMinimumPrice() {
        int totalMiles = mr.totalMiles;
        int minPrice = 0;

        if (totalMiles > 50 && totalMiles < 500) {
            minPrice = 150;
        } else if (totalMiles > 500 && totalMiles < 1000) {
            minPrice = 180;
        } else if (totalMiles > 1000 && totalMiles < 1500) {
            minPrice = 230;
        } else if (totalMiles > 1500 && totalMiles < 2000) {
            minPrice = 300;
        } else if (totalMiles > 2000 && totalMiles < 3000) {
            minPrice = 390;
        } else if (totalMiles > 3000 && totalMiles < 4500) {
            minPrice = 510;
        } else {
            minPrice = 600;
        }
        return minPrice;
    }

    //    public static int getTotalMiles(){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Please enter your miles of your trip to calculate the minimum price : ");
//        int totalMiles =sc.nextInt();
//        return totalMiles;
//
//    }
    public boolean getProceed() {
        System.out.println("\nWould you like to proceed? Yes/No : ");
        String input = ch.checkAnswer(sc);
        if (input.equalsIgnoreCase("Yes")) {
            return true;
        } else {
            System.out.println("Thank you for choosing our Javengers Airlines.");
            return false;
        }
    }

    //User story #4
//          it's a round trip -> departing and returning dates.
//          If it's a one-way trip -> departing date.
////        If it's a multi-city trip -> departing and returning dates for all flights.
////        (User should be able to input the dates only in chronological order)

    public void checkDate(int num) {
        System.out.println("\nThank you for choosing our Travel Agency. ");
        String departDate, returnDate;
        switch (num) {
            case 1:
                System.out.println("Please enter your departing date (mm-dd-yyyy)");
                departDate = ch.checkDate(sc);
                break;
            case 2:
                System.out.println("Please enter your departing date (mm-dd-yyyy)");
                departDate = ch.checkDate(sc);
                System.out.println("Please enter your return date (mm-dd-yyyy)");
                returnDate = ch.checkDate(sc);
                while (LocalDate.parse(returnDate).isBefore(LocalDate.parse(departDate))){
                    System.out.println("Incorrect date! Please enter the valid date:");
                    returnDate = ch.checkDate(sc);
                }
                break;
            case 3:
                for(int i =1; i<mr.numOfCities; i++){
                    System.out.println("Please enter your"+(i) +"city departing date (mm-dd-yyyy)");
                    departDate = ch.checkDate(sc);
                    System.out.println("Please enter your"+(i) +"city return date (mm-dd-yyyy)");
                    returnDate = ch.checkDate(sc);
                    while (LocalDate.parse(returnDate).isBefore(LocalDate.parse(departDate))){
                        System.out.println("Incorrect date! Please enter the valid date:");
                        returnDate = ch.checkDate(sc);
                    }
                }
                break;
            default:
                System.out.println("Incorrect input. Please try again:");
        }

    }

}

