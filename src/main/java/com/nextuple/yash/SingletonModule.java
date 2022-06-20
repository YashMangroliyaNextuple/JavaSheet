package com.nextuple.yash;

class Singleton{
    private static Singleton e=null;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if(e==null)
        {
            e=new Singleton();
        }
        return e;
    }
    public void property()
    {
        System.out.println("It is singleton class");
    }
}

public class SingletonModule {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        s.property();
    }
}
