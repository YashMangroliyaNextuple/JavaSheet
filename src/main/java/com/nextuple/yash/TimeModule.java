package com.nextuple.yash;

import java.time.LocalDate;
import java.util.Scanner;

public class TimeModule {
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you birthday date ");
        System.out.println("Enter month (1-12): ");
        int mm=sc.nextInt();
        System.out.println("Enter day of month (1-31): ");
        int dd=sc.nextInt();
        LocalDate ld1=LocalDate.now();
        LocalDate ld2=LocalDate.of(ld1.getYear(),mm,dd);
        int n1,n2,daysRemaining;
        n1=ld1.getDayOfYear();
        n2=ld2.getDayOfYear();
        //System.out.println(n2);
        if(n1<n2)
        {
            daysRemaining=n2-n1;
        }
        else {
            LocalDate ld3=LocalDate.of(ld1.getYear()+1,mm,dd);
            daysRemaining=ld1.lengthOfYear()-n1 + ld3.getDayOfYear();
        }
        System.out.println(daysRemaining+" Days are remaining");
    }
}
