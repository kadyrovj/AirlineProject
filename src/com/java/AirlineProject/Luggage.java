package com.java.AirlineProject;

//User story 8. As a user I want to be able to pick the amount of baggage: carry-on, checked.
//        1 carry-on up to 17 lbs - free. If weight exceeds: $2 per lb.
//        Additional carry-on baggage is $40.
//        1 checked up to 50 lbs - free. If weight exceeds: $4 per lb.
//        Additional checked baggage is $100.

import java.util.Scanner;

public class Luggage {
    Scanner sc = new Scanner(System.in);

    int carryOn = sc.nextInt();
    double carryOnWeight = sc.nextDouble();
    double carryOnPrice;

    int luggage = sc.nextInt();
    double luggageWeight = sc.nextDouble();
    double luggagePrice;

    double additionToTicketPrice;

    public double getCarryOn() {
        if (carryOn > 1) {
            if (carryOnWeight > 17) {
                carryOnPrice = (carryOn * 40) + (carryOnWeight * 2);
            }
        } else {
            carryOnPrice = carryOn * 40;
        }
        return carryOnPrice;
    }


    public double getLuggage() {
        if (luggage > 1) {
            if (luggageWeight > 50) {
                luggagePrice = (luggageWeight * 2) + (luggage * 100);
            } else {
                luggagePrice = luggageWeight * 2;
            }
        }
        return luggagePrice;
    }

    public double getAdditionToTicketPrice() {

        additionToTicketPrice = carryOnPrice + luggagePrice;

        return additionToTicketPrice;
    }
}

