package com.java.AirlineProject;

import java.util.Scanner;

public class Airline {
    Check ch = new Check();
    String name;
    String lastName;
    String email;
    String DOB;

    int phoneNumber;
    long cardNumber;
    int monthOfDate;
    int yearOfDate;
    int cvv;
    String cardHolderName;

    public void Airline(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter traveller " + i +" first name: ");
        this.name = ch.checkName(sc);
        System.out.println("Please enter traveller " + i +" last name: ");
        this.lastName = ch.checkName(sc);
        System.out.println("Please enter traveller " + i + " email: ");
        this.email = sc.nextLine();
        System.out.println("Please enter traveller " + i +" phone number: ");
        this.phoneNumber = ch.checkInt(sc);
        System.out.println("Please enter traveller " + i + " date of birth: ");
        this.DOB = sc.nextLine();

    }

    public void numOfTravellers(int num){
        for(int i=1; i<= num;i++){
            Airline(i);
        }
    }
}
class MainAirline{
    public static void main(String[] args) {
        Airline ar = new Airline();
        ar.numOfTravellers(2);
    }
}
