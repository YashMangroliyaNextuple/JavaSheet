package com.nextuple.yash;

import com.nextuple.yash.exceptions.InvalidInputException;
import java.util.Scanner;

public class ExceptionTester {

    public void collectInformation() throws InvalidInputException
    {
        Scanner sc =new Scanner(System.in);
        String name;
        int age,salary;
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter age: ");
        age=sc.nextInt();
        if(age<0 || age>110)
        {
            throw new InvalidInputException("Invalid age");
        }
        System.out.print("Enter salary: ");
        salary=sc.nextInt();
        if(salary<0)
        {
            throw new InvalidInputException("Salary can not be negative");
        }

        // code to store information in SQL

    }

    public static void main(String[] args) {
        ExceptionTester exceptionTester=new ExceptionTester();
        System.out.println("Welcome !!!");
        try{
            exceptionTester.collectInformation();
            System.out.println("Information Stored Successfully");
        }catch(InvalidInputException iie)
        {
            System.out.println(iie.getMessage());
        }
        finally {
            System.out.println("Good Bye !!!");
        }
    }
}
