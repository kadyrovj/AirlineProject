package com.java.AirlineProject;


import java.util.Scanner;

public class Ramilya extends DataBase {
    public static void main(String[] args) {
        DataBase db = new DataBase();
       db.showCities(db.getCities());
        Scanner sc = new Scanner(System.in);
        double minimumPrice = getMinimumPrice();
        System.out.println(minimumPrice);
        getProceed();


    }
    public static double getMinimumPrice(){
        int totalMiles =getTotalMiles();
        int minPrice = 0;

        if(totalMiles > 50 && totalMiles <500){
            minPrice =150;
        } else if (totalMiles > 500 && totalMiles <1000) {
            minPrice = 180;
        }else if (totalMiles > 1000 && totalMiles <1500) {
            minPrice =230;
        }else if (totalMiles > 1500 && totalMiles <2000) {
            minPrice =300;
        }else if(totalMiles >2000 && totalMiles <3000) {
            minPrice=390;
        }else if (totalMiles > 3000 && totalMiles <4500) {
            minPrice =510;

        }else {
            minPrice =600;
        }
        return minPrice;
    }
    public static int getTotalMiles(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your miles of your trip to calculate the minimum price : ");
        int totalMiles =sc.nextInt();
        return totalMiles;

    }
    public static boolean getProceed(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Would you like to proceed? Yes/No : ");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("Yes")) {
            return true;
        }else {
            return false;
        }
    }

}