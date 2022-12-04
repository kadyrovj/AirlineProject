package com.java.AirlineProject;

public class MainClass {
    public static void main(String[] args) {
        double totalPrice = 0;
        Jasur ar = new Jasur();
        Chimita fl = new Chimita();
        ar.confirmPurchase(2);
        fl.directOrConnectingFlight(totalPrice);

    }
}
