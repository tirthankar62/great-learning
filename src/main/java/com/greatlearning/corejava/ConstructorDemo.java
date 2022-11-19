package com.greatlearning.corejava;

public class ConstructorDemo {

    public ConstructorDemo()
    {
        System.out.println("Example of default constructor");
    }
    public ConstructorDemo(int no)
    {
        System.out.println("Example of parameterised consturctor: " + no);
    }

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo();
        ConstructorDemo c2 = new ConstructorDemo(10);

    }
}
