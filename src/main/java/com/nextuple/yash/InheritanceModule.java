package com.nextuple.yash;

abstract class Bike
{
    abstract void run();
}

class Yamaha extends Bike{
    public void run()
    {
        System.out.println("Yamaha bike is runnning");
    }
}

public class InheritanceModule {
    public static void main(String[] args) {
        Yamaha yamaha=new Yamaha();
        yamaha.run();
    }
}
