package com.nextuple.yash;

import java.util.ArrayList;
import java.util.HashMap;

public class NestedCollections {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> managers=new HashMap<>();
        ArrayList<String> reportees;
        reportees=new ArrayList<>();
        reportees.add("Akshay");
        reportees.add("Aryan");
        reportees.add("Akshita");
        managers.put("Akshat",reportees);

        reportees=new ArrayList<>();
        reportees.add("Nehal");
        reportees.add("Prafull");
        reportees.add("Abhishek");
        managers.put("Chandrakant",reportees);

        reportees=new ArrayList<>();
        reportees.add("Yashank");
        reportees.add("Ashutosh");
        reportees.add("Shivam");
        managers.put("Gaurav",reportees);

        for(String manager : managers.keySet())
        {
            System.out.println("Manager: "+manager);
            System.out.println("Reportees: ");
            for(String reportee: managers.get(manager))
            {
                System.out.println(reportee);
            }
            System.out.println("");
        }
    }
}
