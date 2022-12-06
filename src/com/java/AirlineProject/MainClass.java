package com.java.AirlineProject;

public class MainClass {
    public static void main(String[] args) {
        double totalPrice = 0;
        Marina mr = new Marina();
        Ramilya rm = new Ramilya();
        Gentian tr = new Gentian();
        //Karina kr  = new Karina();
        Chimita fl = new Chimita();
        Igor gr = new Igor();
        Anastasiia ns = new Anastasiia();
        Jasur ar = new Jasur();

        mr.Welcome();
        totalPrice=rm.getMinimumPrice();
        System.out.println("The minimum price of the trip = $"+totalPrice);
        if(!rm.getProceed()){
            System.exit(0);
        }
        int options = mr.inputTypeOfFlight;
        rm.checkDate(options);
        totalPrice=tr.numberOfTravelers(totalPrice);
        //
        totalPrice = fl.directOrConnectingFlight(totalPrice);
        totalPrice = gr.getBaggage(totalPrice);
        System.out.println(totalPrice);
        //ns.Info();
        ar.confirmPurchase(tr.numOfTravellers);
   }
}

