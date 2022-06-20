package com.nextuple.yash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormattingModule {
    public static void main(String[] args) {
        System.out.println("Select date format");
        System.out.println("1. dd/MM/yyyy ");
        System.out.println("2. MM/dd/yyyy ");
        System.out.println("3. yyyy/MM/dd ");
        System.out.print("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Date date =new Date();
        SimpleDateFormat formatter;
        if(choice==1)
        {
            formatter=new SimpleDateFormat("dd/MM/yyyy");
        }
        else if(choice==2)
        {
            formatter=new SimpleDateFormat("MM/dd/yyyy");
        }
        else {
            formatter=new SimpleDateFormat("yyyy/MM/dd");
        }
        System.out.println(formatter.format(date));
    }
}
