package com.java.AirlineProject;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
            System.out.println("Incorrect input! Please enter only numbers:");
            return false;
        }
    }

    public  boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            System.out.println("Incorrect input! Please enter only numbers:");
            return false;
        }

    }
    public boolean isLong(String str){
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e){
            System.out.println("Incorrect input! Please enter only numbers:");
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
            System.out.println("You have entered unsupported characters or digits. Please try again:");
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
    //checks if the entered answer is YES or NO
    public  String checkAnswer (Scanner sc){
        String answer = sc.nextLine();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Incorrect input! Please enter YES or NO:");
            answer = sc.nextLine();
        }
        return answer;
    }
    public  int checkIntLess15(Scanner sc){
        int num = checkInt(sc);
        while(num<1 || num>15){
            System.out.println("Please enter a number in range 1-15");
            num=checkInt(sc);
        }
        return num;
    }
    public  int checkInt1or2(Scanner sc){
        int num = checkInt(sc);
        while(num!=1 && num!=2){
            System.out.println("Incorrect input! Please enter 1 or 2:");
            num=checkInt(sc);
        }
        return num;
    }

    public long checkCard(Scanner sc){
        long num = checkLong(sc);
        while (String.valueOf(num).length()!=16){
            System.out.println("Incorrect input. Please enter the card number again:");
            num=checkLong(sc);
        }
        return num;
    }

    public int checkCvv(Scanner sc){
        int num = checkInt(sc);
        while (String.valueOf(num).length()!=3){
            System.out.println("Incorrect input. Please enter the CVV again:");
            num=checkInt(sc);
        }
        return num;
    }
    public boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public boolean isFlightDateCorrect(String date){
            try{
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                Date datenow = new Date();
                String datenowstring = df.format(datenow);
                df.setLenient(false);
                return df.parse(date).after(df.parse(datenowstring));
            }catch (ParseException e) {
                return false;
            }
    }
    public String checkFlightDate(Scanner sc){
        String str = sc.nextLine();
        while(!isDateValid(str) || !isFlightDateCorrect(str)){
            System.out.println("Incorrect input. Please enter the date in format mm/dd/yyyy");
            str = sc.nextLine();
        }
        return str;
    }
    public boolean isBirthDateCorrect(String date){
        try{
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date datenow = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(datenow);
            c.add(Calendar.YEAR,-100);
            Date maxdate=c.getTime();
            String datenowstring = df.format(datenow);
            String maxdatestring = df.format(maxdate);
            df.setLenient(false);
            return df.parse(date).after(df.parse(maxdatestring)) && df.parse(date).before(df.parse(datenowstring));
        }catch (ParseException e) {
            return false;
        }
    }
    public String checkBirthDate(Scanner sc){
        String str = sc.nextLine();
        while(!isDateValid(str) || !isBirthDateCorrect(str)){
            System.out.println("Incorrect input. Please enter the date in format mm/dd/yyyy");
            str = sc.nextLine();
        }
        return str;
    }
    public boolean isShortDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat("MM/yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public boolean isShortDateCorrect(String date){
        try{
            DateFormat df = new SimpleDateFormat("MM/yyyy");
            Date datenow = new Date();
            String datenowstring = df.format(datenow);
            df.setLenient(false);
            if(df.parse(date).after(df.parse(datenowstring))){
                return true;
            }
            else{
                System.out.println("Expired card!");
                return false;
            }
        }catch (ParseException e) {
            return false;
        }
    }
    public String checkExpirationDate(Scanner sc){
        String str = sc.nextLine();
        while(!isShortDateValid(str) || !isShortDateCorrect(str)){
            System.out.println("Incorrect input. Please enter the date in format mm/yyyy");
            str = sc.nextLine();
        }
        return str;
    }
    public String checkEmail(Scanner sc){
        String str = sc.nextLine();
        boolean ends = str.endsWith("@gmail.com");
        boolean ends1 = str.endsWith("@icloud.com");
        boolean ends2 = str.endsWith("@yahoo.com");
        boolean ends3 = str.endsWith("@hotmail.com");
        boolean ends4 = str.endsWith("@mail.ru");
        boolean ends5 = str.endsWith("@yandex.ru");

        while (!(ends || ends1 || ends2 || ends3 || ends4 || ends5 )){
            System.out.println("Incorrect input! Please enter valid email:");
            str = sc.nextLine();
            ends = str.endsWith("@gmail.com");
            ends1 = str.endsWith("@icloud.com");
            ends2 = str.endsWith("@yahoo.com");
            ends3 = str.endsWith("@hotmail.com");
            ends4 = str.endsWith("@mail.ru");
            ends5 = str.endsWith("@yandex.ru");


        }
        return str;
    }
    public boolean checkAdult(String DOB){
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date datenow = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(datenow);
            c.add(Calendar.YEAR,-18);
            datenow=c.getTime();
            String datenowstring = df.format(datenow);
            df.setLenient(false);
            try{
                return df.parse(DOB).before(df.parse(datenowstring));
            }
            catch (ParseException e){
                return false;
            }
    }
}
