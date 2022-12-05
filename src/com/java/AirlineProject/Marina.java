package com.java.AirlineProject;

//User story 1. As a user I want to be able to pick the type of trip: one-way, round, or multi-city.
//If it's a multi-city I want to be able to enter the number of destination cities.

import java.util.Scanner;

public class Marina {
    Check ch = new Check();
    DataBase db = new DataBase();

    Scanner sc = new Scanner(System.in);

    public void Welcome() {
        System.out.println("\t\t\tWelcome to Javengers Airline");
        System.out.println("Please choose the type of trip: 1) one-way 2) round 3) multi-city");


        String type;
        int numCities = 0;
        int input = reader();
        type = typeOfTrip(input);
        if (input == 3) {
            numCities = numberOfCities();
        }
        System.out.println(getTotalMiles(type));

        //System.out.println(type);  // Not sure if these are needed
        //System.out.println(numCities);

    }

    public int reader() {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        while (inputNum < 1 || inputNum > 3) {

            while (!scanner.hasNextInt()) {
                System.out.println("Enter a valid digit");
                scanner.next();
            }
            inputNum = scanner.nextInt();
            if (inputNum < 1 || inputNum > 3) {
                System.out.println("Enter a valid number from 1 to 3");
            }
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

    public int numberOfCities() {
        int numCities = 0;
        System.out.println("Enter number of destination cities");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Enter a valid digit");
            scanner.next();
        }
        numCities = scanner.nextInt();
        return numCities;
    }




//User story 2. As a user I want to be able to pick the departure and destination cities from the list by their number.
    //For example, I want to fly from Chicago to New York, so I pick corresponding numbers, like 2 and 5.
//If it's a multi-city trip then I should not be able to choose the same number twice in a row.


    public int getTotalMiles(String typeOfFlight) {
        Scanner sc = new Scanner(System.in);
        int[][] miles = db.getMiles();
        int totalMiles = 0;
        int places[] = new int[10];
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
            for (int k = 1; k <= numberOfCities(); k++) {
                System.out.println("Enter the number of the destination city:");
                places[k] = ch.checkIntLess15(sc);
                while (places[k] == places[k - 1]) {
                    System.out.println("Incorrect input! Please enter the number of the destination city again:");
                    places[k] = ch.checkIntLess15(sc);
                }
                totalMiles = totalMiles + miles[places[k - 1] - 1][places[k]];
            }
            System.out.println(totalMiles);
        }
        return totalMiles;

          // I made some corrections, I hope I matched the methods right,
        // pls let me know if there's anything I can change - Jasur

    }
}


