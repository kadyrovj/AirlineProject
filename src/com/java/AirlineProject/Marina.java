package com.java.AirlineProject;

//User story 1. As a user I want to be able to pick the type of trip: one-way, round, or multi-city.
//If it's a multi-city I want to be able to enter the number of destination cities.

import java.util.Scanner;

public class Marina {
    Check ch = new Check();
    DataBase db = new DataBase();
    Scanner sc = new Scanner(System.in);
    String typeOfFlight;
    int inputTypeOfFlight;//
    int places[] = new int[10];
    int numOfCities;
    int totalMiles;

    public void Welcome() {
        System.out.println("\t\t\tWelcome to Javengers Airline");
        System.out.println("Please choose the type of trip: 1) one-way 2) round 3) multi-city");

        inputTypeOfFlight = readerTypeOfTrip();//number
        typeOfFlight = typeOfTrip(inputTypeOfFlight);//string
        db.showCities(db.getCities());
        if (inputTypeOfFlight == 3) {
            numOfCities = numberOfCities();
        }
        totalMiles=getTotalMiles();

    }
////!!!!
    public int readerTypeOfTrip() {
        int inputNum = ch.checkInt(sc);
        while (inputNum < 1 || inputNum > 3){
            System.out.println("Incorrect input! Please enter 1 or 2 or 3:");
            inputNum = ch.checkInt(sc);
        }
        return inputNum;
    }

    public String typeOfTrip(int input) {
        String type = "";
        switch (input) {
            case 1:
                type = "one-way";
                break;
            case 2:
                type = "round";
                break;
            case 3:
                type = "multi-city";
                break;
        }
        return type;

    }
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public int numberOfCities() {
        System.out.println("\nHow many cities would you like to visit?:");
        int numCities = ch.checkInt(sc);
        while (numCities<1 || numCities>15) {
            System.out.println("Incorrect input! Please enter 1-15:");
            numCities = ch.checkInt(sc);
        }
        return numCities;
    }




//User story 2. As a user I want to be able to pick the departure and destination cities from the list by their number.
    //For example, I want to fly from Chicago to New York, so I pick corresponding numbers, like 2 and 5.
//If it's a multi-city trip then I should not be able to choose the same number twice in a row.


    public int getTotalMiles() {
        Scanner sc = new Scanner(System.in);
        //db.showCities(db.getCities());
        int[][] miles = db.getMiles();
        int totalMiles = 0;
        //int places[] = new int[10];
        System.out.println("\nEnter the number of the city you want to depart from:");
        places[0] = ch.checkIntLess15(sc);
        if (typeOfFlight.equalsIgnoreCase("round") || typeOfFlight.equalsIgnoreCase("one-way")) {
            System.out.println("Enter the number of the destination city:");
            places[1] = ch.checkIntLess15(sc);
            while (places[0] == places[1]) {
                System.out.println("Incorrect input! Please enter the number of the destination city again:");
                places[1] = ch.checkIntLess15(sc);
            }
            totalMiles = miles[places[0] - 1][places[1]];
        } else if (typeOfFlight.equalsIgnoreCase("multi-city")) {
            for (int k = 1; k <= numOfCities; k++) {
                System.out.println("Enter the number of the destination city:");
                places[k] = ch.checkIntLess15(sc);
                while (places[k] == places[k - 1]) {
                    System.out.println("Incorrect input! Please enter the number of the destination city again:");
                    places[k] = ch.checkIntLess15(sc);
                }
                totalMiles = totalMiles + miles[places[k - 1] - 1][places[k]];
            }
            //System.out.println(totalMiles);
        }
        return totalMiles;
    }

}


