package com.nextuple.yash;

import com.nextuple.yash.annotations.classAnnotation;
import com.nextuple.yash.annotations.fieldAnnotation;

@classAnnotation
class Employee
{
    @fieldAnnotation(key="id")
    int id;
    @fieldAnnotation(key="fName")
    String firstName;
    @fieldAnnotation(key="lname")
    String lastName;
    int age;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class AnnotationTester {
    public static void main(String gg[])
    {
        Employee employee=new Employee();
        Class c=employee.getClass();
        if(c.isAnnotationPresent(classAnnotation.class))
        {
            System.out.println("Annotation is present on class");
        }
        else  System.out.println("Annotation is not present on class");
    }
}
