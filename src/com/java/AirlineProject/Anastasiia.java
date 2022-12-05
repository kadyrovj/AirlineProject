package com.java.AirlineProject;

import java.util.Scanner;

public class Anastasiia {
    public void Info (String[] city, double price, String dateTicket, int NumbTrav, String ClassType, String TypeOfFly) {
        Check ch = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see all information about your fly? Please enter YES or NO: ");
        String answer = ch.checkAnswer(sc);

        if (answer.equalsIgnoreCase("Yes")) {

            System.out.println("************************************************************************");
            //  System.out.println("Your flight: "+ \n cityDep +"-" cityArriv ); //User stories 1+2
            System.out.println("Total Price = $" + price);       //+US 3 +
            System.out.println("Date:" + dateTicket);            //UStory  - 4
            System.out.println("Number of travelers: " + NumbTrav);     //User Story -5
            System.out.println("Tickets class: " + ClassType);    // User Story -6
            System.out.println("Type of flight: " + TypeOfFly);  // User story -7


            // System.out.println("Baggage: " + getCarryOn + getLuggage + getAdditionToTicketPrice); //+US -8 +



            System.out.println("************************************************************************");

        }
    }
}