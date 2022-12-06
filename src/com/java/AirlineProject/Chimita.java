package com.java.AirlineProject;

import java.util.Scanner;

public class Chimita {
    public String typeOfFlight2;
    public double directOrConnectingFlight(double price){
        Check ch = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWould you like a connecting or direct flight? \nPlease enter 1 - for regular and 2 - for direct flight:");
        int flight = ch.checkInt1or2(sc);
        if (flight ==  2){
            price=price*1.15;
            typeOfFlight2="direct";
            //System.out.println("The price of direct ticket $" + price);
        }else{
            typeOfFlight2="connecting";
        }
        return price;
    }
}
