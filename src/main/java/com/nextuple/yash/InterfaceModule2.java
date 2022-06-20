package com.nextuple.yash;

import com.google.gson.Gson;
import com.nextuple.yash.interfaces.Currency;
import java.io.*;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


class Rupee implements Currency
{

}
class Dollar implements Currency
{
    public void printIt(Integer amount){
        Locale locale=new Locale("en","US");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(amount));
    }
}
class Pound implements Currency
{
    public void printIt(Integer amount){
        Locale locale=new Locale("en","GB");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(amount));
    }
}


class Printer
{
    public void printAmount(String currency,int amount) {

        try{
            Class c=Class.forName("com.nextuple.yash."+currency);
            Class arr[]=new Class[1];
            arr[0]=Integer.class;
            String methodName="printIt";
            Method m=c.getMethod(methodName,arr);
            m.invoke(c.getDeclaredConstructor().newInstance(),amount);
        }catch(Exception e)
        {
            System.out.println(e.getMessage()+" HEREEEEEE");
        }
    }
}


class Property{
    String currency;
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

public class InterfaceModule2 {
    public static void main(String[] args) {

        int amount;
        System.out.println("Enter Amount: ");
        Scanner sc=new Scanner(System.in);
        amount=sc.nextInt();

        File file=new File("src/main/java/com/nextuple/yash/configFiles/currencyInfo.txt");
        //File file=new File("src/main/java/com/nextuple/yash/configFiles/jsonFile.txt");
        String jsonString="";
        try{
            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"r");
            while(randomAccessFile.getFilePointer()<randomAccessFile.length())
            {
                jsonString += randomAccessFile.readLine();
            }
            randomAccessFile.close();
        }catch(Exception e){
            System.out.println(e);
        }
        Gson gson=new Gson();
        Property property=gson.fromJson(jsonString,Property.class);
        Printer printer=new Printer();

        printer.printAmount(property.getCurrency(),amount);



//        if(property.getCurrency().equalsIgnoreCase("Pound"))
//        {
//            printer.printAmount( new Pound() , amount);
//        }else if(property.getCurrency().equalsIgnoreCase("Dollar"))
//        {
//            printer.printAmount( new Dollar() , amount);
//        }else
//        {
//            printer.printAmount( new Rupee() , amount);
//        }
    }
}
