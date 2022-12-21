package com.java.AirlineProject;

//User story 8. As a user I want to be able to pick the amount of baggage: carry-on, checked.
//        1 carry-on up to 17 lbs - free. If weight exceeds: $2 per lb.
//        Additional carry-on baggage is $40.
//        1 checked up to 50 lbs - free. If weight exceeds: $4 per lb.
//        Additional checked baggage is $100.

import java.util.Scanner;

public class Igor {
    Scanner sc = new Scanner(System.in);
    Check ch = new Check();
    int carryOn;
    int carryOnMaxWeight=17;
    double carryOnPricePerlb=2;
    double carryOnPricePerItem=40;

    int luggage;
    int luggageMaxWeight=50;
    double luggagePricePerlb=4;
    double luggagePricePerItem=100;
    public double getBaggage(double totalPrice) {

        System.out.println("\nEnter the number of carry-on items: ");
        this.carryOn = ch.checkInt(sc);
        totalPrice=numberOfLug(carryOn,totalPrice,carryOnMaxWeight,carryOnPricePerlb,carryOnPricePerItem,"carry-on");

        System.out.println("\nEnter the number of checked items: ");
        this.luggage = ch.checkInt(sc);
        totalPrice=numberOfLug(luggage,totalPrice,luggageMaxWeight,luggagePricePerlb,luggagePricePerItem, "checked");
        return totalPrice;
    }
    public double numberOfLug(int lug,double totalPrice, int maxWeight, double pricePerLb, double pricePerItem, String type){
        if(lug==0){
        }
        else if(lug==1){
            totalPrice+=getWeight(maxWeight,pricePerLb,type);
        }
        else{
            System.out.println("Additional charges apply. First luggage up to "+maxWeight+" lbs for free. \nCost per each next item $"+ pricePerItem);
            for(int i=1; i<=lug; i++){
                if(i==1){
                    totalPrice+=getWeight(maxWeight,pricePerLb,type);
                }
                else{
                    totalPrice+=pricePerItem;
                }
            }
        }
        return totalPrice;
    }

    public double getWeight(double typeWeight,double typePrice, String type){
        double price =0;
        System.out.println("Enter the weight of your first "+type+" luggage (lbs):");
        double weight = ch.checkDouble(sc);
        if(weight>typeWeight){
            System.out.println("Your luggage is overweight. Additional charges apply.");
            price=(weight-typeWeight)*typePrice;
        }
        return price;
    }
}

