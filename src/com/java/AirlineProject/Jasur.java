package com.java.AirlineProject;

/*
    User story 10. As a user I want to be able to confirm the purchase.
    If yes then I want to be able to input my personal information ( for every traveler ):
    name, surname, date of birth, email, and phone number;
    and enter once:  card number, expiration date, CVV, and cardholder's name.
 */
import java.util.Scanner;

public class Jasur {
    Check ch = new Check();
    String name;
    String lastName;
    String email;
    String DOB;

    long phoneNumber;
    long cardNumber;
    String expirationDate;
    //int monthOfDate;
    //int yearOfDate;
    int cvv;
    String cardHolderName;

    public void confirmPurchase(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter YES if you confirm the purchase: ");
        String result = ch.checkAnswer(sc);
        if(result.equalsIgnoreCase("yes")){
            System.out.println("\n---Please fill out the next information---");
            numOfTravellers(i);
            paymentDetails();
            System.out.println("\nThank you for your purchase. Have a safe flight!");
        }else {
            System.out.println("\nThank you for choosing JavengersAirlines. Good Luck!");
            System.exit(0);
        }
    }
    public void Airline(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter traveller " + i +" first name: ");
        this.name = ch.checkName(sc);
        System.out.println("Please enter traveller " + i +" last name: ");
        this.lastName = ch.checkName(sc);
        System.out.println("Please enter traveller " + i + " email: ");
        this.email = sc.nextLine();
        System.out.println("Please enter traveller " + i +" phone number: ");
        this.phoneNumber = ch.checkLong(sc);
        System.out.println("Please enter traveller " + i + " date of birth (mm-dd-yyyy): ");
        this.DOB = ch.checkDate(sc);

    }
    public void numOfTravellers(int num){
        for(int i=1; i<= num;i++){
            Airline(i);
        }
    }
    public void paymentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter cardholder's full name: ");
        this.cardHolderName = ch.checkName(sc);
        System.out.println("Please enter your card number: ");
        this.cardNumber = ch.checkCard(sc);
        //System.out.println("Please enter expiration month of the card: "); //find a checkDate for month and year
        //this.monthOfDate = ch.checkInt(sc);
        //System.out.println("Please enter expiration year of the card: ");
        //this.yearOfDate = ch.checkInt(sc);
        System.out.println("Please enter expiration date of the card: (mm/yyyy) ");
        this.expirationDate = ch.checkExpirationDate(sc);
        System.out.println("Please enter CVV: ");
        this.cvv = ch.checkCvv(sc);
    }
}

