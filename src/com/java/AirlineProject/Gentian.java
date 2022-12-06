package com.java.AirlineProject;

import java.util.Scanner;

public class Gentian {
    // As a user I want to be able to pick the number of travelers: adults,
    // children aged 2-17,
    // infants(under 2)
    //The price of a ticket: adults - regular, children - 50% discount, infants - free
    public static int numOfTravellers;
    public double numberOfTravelers(double price){

        Check ch = new Check();//

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many adults are traveling?:");
        int adults = ch.checkInt(sc);

        System.out.println("How many children are traveling? Ages 2 to 17:");
        int children = ch.checkInt(sc);

        System.out.println("How many infants are traveling? Younger than 2:");
        int infants = ch.checkInt(sc);

        numOfTravellers=adults+children;

        price = (adults * price) + (children * price * 0.5);

        //System.out.println("The total price is $" + price);

        return price;

    }
}
