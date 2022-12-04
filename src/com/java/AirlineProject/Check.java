package com.java.AirlineProject;


import java.util.Scanner;

public class Check {
    public  int checkInt(Scanner sc) {
        String intStr = sc.nextLine();
        while (!isInteger(intStr)) {
            intStr = sc.nextLine();
        }
        return Integer.parseInt(intStr);
    }
    public long checkLong(Scanner sc) {
        String longStr = sc.nextLine();
        while (!isLong(longStr)) {
            longStr = sc.nextLine();
        }
        return Long.parseLong(longStr);

    }
    public  double checkDouble(Scanner sc) {
        String intStr = sc.nextLine();
        while (!isDouble(intStr)) {
            intStr = sc.nextLine();
        }
        return Double.parseDouble(intStr);
    }

    public  boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            System.out.println("Incorrect input! Please input only numbers:");
            return false;
        }
    }

    public  boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            System.out.println("Incorrect input! Please input only numbers:");
            return false;
        }

    }
    public boolean isLong(String str){
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e){
            System.out.println("Incorrect input! Please input only numbers:");
            return false;
        }
    }

    public boolean isAlphabetical(String name) {
        int count = 0;
        char[] ch = name.toCharArray();
        for (char c : ch) {
            if (Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                count++;
            }
        }
        if (name.length() == count) {
            return true;
        } else {
            System.out.println("You have entered unsupported characters or digits. Please try again.");
            return false;
        }
    }

    public String checkName(Scanner sc) {
        String name = sc.nextLine();
        while (!isAlphabetical(name)) {
            name = sc.nextLine();
        }
        return name;//
    }
    public static String checkAnswer (Scanner sc){
        String answer = sc.nextLine();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Your input is incorrect! Please enter YES or NO:");
            answer = sc.nextLine();
        }
        return answer;
    }

    //checks if the entered answer is YES or NO
    public  String checkAnswer (Scanner sc){
        String answer = sc.nextLine();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Your input is incorrect! Please enter YES or NO:");
            answer = sc.nextLine();
        }
        return answer;
    }
}
