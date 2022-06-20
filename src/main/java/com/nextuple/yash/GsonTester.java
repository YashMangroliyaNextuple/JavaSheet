package com.nextuple.yash;

import com.google.gson.*;
import java.io.*;
public class GsonTester {
    public static void main(String[] args) {

        // reading file
        File f=new File("src/main/java/com/nextuple/yash/configFiles/jsonFile.txt");
        String jsonString="";
        try{
            RandomAccessFile raf=new RandomAccessFile(f,"r");
            while(raf.getFilePointer()<raf.length())
            {
                jsonString+=raf.readLine();
            }
            raf.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

        Gson gson=new Gson();
        //converting raw json string to Student class object
        Student student=gson.fromJson(jsonString, Student.class);
        System.out.println(student);

        // converting Student class object to json string
        jsonString="";
        jsonString=gson.toJson(student);
        System.out.println(jsonString);

        File f2=new File("src/main/java/com/nextuple/yash/configFiles/newJsonFile.txt");
        try{
            RandomAccessFile raf2=new RandomAccessFile(f2,"rw");
            raf2.writeBytes(jsonString);
            raf2.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }


    }
}

class Student {
    private String name;
    private int age;
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }
}