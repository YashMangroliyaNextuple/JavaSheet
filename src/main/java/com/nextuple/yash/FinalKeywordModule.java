package com.nextuple.yash;

class StaticBlockClass
{
    static{
        System.out.println("THIS IS STATIC BLOCK");
    }
}

class Car
{
    private int numberOfWheels=4;
    private String brandName;
    private int price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class FinalKeywordModule {
    public static void main(String[] args) {
        Car c=new Car();
        c.setBrandName("Tata");
        c.setPrice(1200000);
        StaticBlockClass s=new StaticBlockClass();
    }
}
