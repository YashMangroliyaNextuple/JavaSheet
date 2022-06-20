package com.nextuple.yash;

import javax.naming.NamingException;
import java.util.*;
import java.util.stream.Collectors;

class Department
{
    private int Id;
    private String name;
    public Department(int id, String name) {
        Id = id;
        this.name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Designation
{
    private int id;
    private String name;
    Designation(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class NextupleEmployee
{
    private String firstName;
    private String lastName;
    private Date dateOfJoining;
    private int experience;
    private Date dateOfBirth;
    private Department department;
    private String managerName;
    private Designation designation;
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

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public String toString()
    {
        return this.firstName+" "+this.lastName;
    }

    public NextupleEmployee(String firstName, String lastName,
                            Date dateOfJoining, int experience, Date dateOfBirth, Department department,
                            String managerName, Designation designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.managerName = managerName;
        this.designation = designation;
    }

}

public class StreamCollectionsModule {

    public static ArrayList<NextupleEmployee> sortByLastName(ArrayList<NextupleEmployee> employees)
    {
        return (ArrayList<NextupleEmployee>)employees.stream().sorted( (first,second)-> {
            return first.getLastName().compareTo(second.getLastName());
        }).collect(Collectors.toList());
    }

    public static ArrayList<NextupleEmployee> sortByDateOfJoining(ArrayList<NextupleEmployee> employees)
    {
        return (ArrayList<NextupleEmployee>)employees.stream().sorted( (first,second)-> {
            return first.getDateOfJoining().compareTo(second.getDateOfJoining());
        }).collect(Collectors.toList());
    }
    public static ArrayList<NextupleEmployee> getEmployeesWithExperience(ArrayList<NextupleEmployee> employees,int experience)
    {
        return (ArrayList<NextupleEmployee>)employees.stream().filter( (employee)-> {
            return employee.getExperience()>experience;
        }).collect(Collectors.toList());
    }
    public static Map<String, List<NextupleEmployee>> groupByManagerName(ArrayList<NextupleEmployee> employees)
    {
        Map<String, List<NextupleEmployee>> map1;
        map1 = employees.stream().collect(Collectors.groupingBy(NextupleEmployee::getManagerName));
        return map1;
    }

    public static Set<String> getSetOfManagerNames(ArrayList<NextupleEmployee> employees)
    {
        Map<String, List<NextupleEmployee>> map1;
        map1 = employees.stream().collect(Collectors.groupingBy(NextupleEmployee::getManagerName));
        return map1.keySet();
    }

    public static void main(String[] args) {
        Department hrDepartment=new Department(101,"hr");
        Department financeDepartment=new Department(102,"finance");

        Designation clerk=new Designation(201,"clerk");

        Date rajDateOfJoining=new Date(2022,5,6);
        Date yashankDateOfJoining=new Date(2019,5,6);
        Date nadateOfJoining=new Date(2021,7,1);
        Date rajDOB=new Date(2000,7,21);
        Date yashankDOB=new Date(1999,12,10);
        Date nitinDOB=new Date(2000,4,26);
        Date abhishekDOB=new Date(1998,11,3);


        NextupleEmployee e1=new NextupleEmployee("Raj", "Bhatkariya",rajDateOfJoining, 0, rajDOB, hrDepartment, "Sushant Singh", clerk);
        NextupleEmployee e2=new NextupleEmployee("Yashank", "Meher",yashankDateOfJoining, 3, yashankDOB, hrDepartment, "Sushant Singh", clerk);
        NextupleEmployee e3=new NextupleEmployee("Nitin", "Jaiswal",nadateOfJoining, 0, nitinDOB, financeDepartment, "Priyanka Patel", clerk);
        NextupleEmployee e4=new NextupleEmployee("Abhishek", "Vishwakarma",nadateOfJoining, 1, abhishekDOB, hrDepartment, "Priyanka Patel", clerk);

        ArrayList<NextupleEmployee> employees=new ArrayList<>(Arrays.asList(e1,e2,e3,e4));

//        employees = sortByLastName(employees);
//        employees = sortByDateOfJoining(employees);
        //employees = getEmployeesWithExperience(employees,2);
//        Map<String, List<NextupleEmployee>> map1 = groupByManagerName(employees);
//        System.out.println(map1);

        Set<String> setOfManagerNames=getSetOfManagerNames(employees);
        System.out.println(setOfManagerNames);
//        employees = (ArrayList)employees.stream().sorted( (first,second)-> { return first.getLastName().compareTo(second.getLastName()); }).collect(Collectors.toList());

//        for( NextupleEmployee e : employees)
//        {
//            System.out.println(e.getFirstName());
//        }


    }
}
