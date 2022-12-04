package com.java.AirlineProject;

public class MainClass {
    public static void main(String[] args) {
        double totalPrice = 10;
        Jasur ar = new Jasur();
        Chimita fl = new Chimita();
        Luggage lu = new Luggage(); // luggage class where I calculated the luggage price. Igor

        totalPrice = totalPrice+ lu.additionToTicketPrice; // added luggage price to the total price
        //totalPrice=fl.directOrConnectingFlight(totalPrice);
        ar.confirmPurchase(2);


    }
}
