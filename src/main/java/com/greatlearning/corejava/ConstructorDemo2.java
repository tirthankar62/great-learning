package com.greatlearning.corejava;

public class ConstructorDemo2 {



    public ConstructorDemo2() {

        // your code here...
        System.out.println("I am default constructor.");

    }

    public ConstructorDemo2(int a, float f, String s, char c) {

    // your code here...
        System.out.println("I am Parameterized constructor. I take various arguments as input");

        System.out.println("Square of a: " + a*a);
        System.out.println("Square of f: " + f*f);
        System.out.println("String s: " + s);
        System.out.println("Character c: " + c);

}

    public void observations(){

        System.out.println("inside Observations method");

    }

    public static void main(String[] args) {

        // your code here...
        ConstructorDemo2 c1 = new ConstructorDemo2();
        ConstructorDemo2 c2 = new ConstructorDemo2(10,10.5f,"ABC", 'C');


    }

}


