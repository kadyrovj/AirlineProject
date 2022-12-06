package com.java.AirlineProject;

import java.time.LocalDate;
import java.util.*;

public class Anastasiia {
    public void Info (String typeOfTrip, List<String> cities, List<LocalDate> dates, int numTravelers, String cabinClass, String typeOfFlight, int carryOn, int checked, double totalPrice) {
        Check ch = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to see all information about your flight? Please enter YES or NO: ");
        String answer = ch.checkAnswer(sc);

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("************************************************************************");
            System.out.printf("%-32s %-32s","Type of trip:", typeOfTrip);
            showChosenCities(cities);
            showDates(dates);
            System.out.printf("%-32s %-32s","Number of travelers:", numTravelers);
            System.out.printf("\n%-32s %-32s","Cabin class:", cabinClass);
            System.out.printf("\n%-32s %-32s","Type of flight:",typeOfFlight);
            System.out.printf("\n%-32s %-32s","You added following baggage:",carryOn +" carry-on items; "+checked +" checked items");
            System.out.printf("\n%-32s %-32s","Total price of tickets = $", totalPrice);
            System.out.println("\n\n************************************************************************");

        }
        
    }
    public void showDates(List<LocalDate> dates){
        for(int i =0; i<dates.size();i++) {
            if(i==0){
                System.out.printf("%-32s %-32s","Dates of your trip:",dates.get(0));
            }else{
                System.out.printf("%-32s %-32s"," ",dates.get(i));
            }
            System.out.println();
        }
    }
    public void showChosenCities(List<String> cities){
        System.out.printf("\n%-32s%-32s","Departure city:",cities.get(0));
        for(int i =1; i<cities.size();i++) {
            if(i==1){
                System.out.printf("\n%-32s%-32s","Destination city/cities:",cities.get(1));
            }else{
                System.out.printf("%-32s%-32s"," ",cities.get(i));
            }
            System.out.println();
        }
    }
}
