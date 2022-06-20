package com.nextuple.yash;
import com.nextuple.yash.interfaces.*;

class Shape implements Drawable,Printable
{
    public void printThis() {
        System.out.println("This is print method");
    }
    public void draw(){
        System.out.println("This is draw method");
    }
}

public class InterfaceModule
{
    public void doPrint(Printable p)
    {
        p.printThis();
    }

    public static void main(String[] args) {
        InterfaceModule im=new InterfaceModule();
        Shape s=new Shape();
        im.doPrint(s);
    }
}
