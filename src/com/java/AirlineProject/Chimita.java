package com.java.AirlineProject;

import java.util.Scanner;

public class Chimita {
    public double directOrConnectingFlight(double price){
        Check ch = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like a connecting or direct flight? \nPlease enter 1 - for regular and 2 - for direct flight:");
        int flight = ch.checkInt1or2(sc);
        if (flight ==  1){
            System.out.println("The price of regular ticket $"+ price);
        }else{
            System.out.println("The price of direct ticket $" + price * 1.15);
        }
        return price;
    }
}
