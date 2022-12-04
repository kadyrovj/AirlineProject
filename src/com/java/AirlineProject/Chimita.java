package com.java.AirlineProject;

import java.util.Scanner;

public class Chimita {
    public void regularflyght(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you want to fly connecting or direct? Please enter 1 - for regular and 2 - for direct flight");
        int flight = sc.nextInt();
        double price = 100;


        if (flight ==  1){
            System.out.println("The price of regular ticket "+ price+" $");
        }else{
            System.out.println("The price of direct ticket " + price * 1.15 + " $");
        }


    }
}
