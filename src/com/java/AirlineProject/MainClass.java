package com.java.AirlineProject;

public class MainClass {
    public static void main(String[] args) {
        double totalPrice = 0;
        Jasur ar = new Jasur();
        Chimita fl = new Chimita();
        Luggage lu = new Luggage(); // luggage class where I calculated the luggage price. Igor

        totalPrice = totalPrice+ lu.additionToTicketPrice; // added luggage price to the total price

        ar.confirmPurchase(2);
        fl.directOrConnectingFlight(totalPrice);

    }
}
