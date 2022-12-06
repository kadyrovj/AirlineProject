package com.java.AirlineProject;

public class MainClass {
    public static void main(String[] args) {
        double totalPrice;
        Marina mr = new Marina();
        Ramilya rm = new Ramilya();
        Gentian tr = new Gentian();
        Karina cc  = new Karina();
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
        rm.checkDate();

        totalPrice = tr.numberOfTravelers(totalPrice);
        totalPrice = cc.selectedCabinClass(totalPrice);
        totalPrice = fl.directOrConnectingFlight(totalPrice);
        totalPrice = gr.getBaggage(totalPrice);
        ns.Info(mr.typeOfFlight, mr.totalCities, rm.totalDates, tr.totalNumOfTravelers, cc.userCabinClass,fl.typeOfFlight2, gr.carryOn, gr.luggage,totalPrice);
        ar.confirmPurchase();
   }
}

