package Basics;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class SalarySlip {

   static void  salaryFormat(int val ,Locale l){
       NumberFormat nf = NumberFormat.getCurrencyInstance(l);
       String temp = nf.format(val);
       System.out.println("This is the formatted sal : " + temp);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select language");
        System.out.println("Enter 1 for Hindi , 2 for English, 3 for French");
        int langChoice = sc.nextInt();
        Locale locale;
        if (langChoice ==1){
            locale = new Locale("Hi","IN");

        } else if (langChoice == 2) {
            locale = new Locale("en","US");
        } else if (langChoice == 3 ) {
            locale = new Locale("fr","FR");
        }else {
            System.out.println("Wrong choice , now using English as default");
            locale = new Locale("en","US");
        }

        System.out.println("Please enter your Salary");
        int sal = sc.nextInt();
        System.out.println("this is the Salary : " + sal);
       salaryFormat(sal,locale);
    }
}
