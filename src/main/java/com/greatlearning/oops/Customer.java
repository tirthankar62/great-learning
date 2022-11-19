package com.greatlearning.oops;

public class Customer {

    String fullName;
    int age;

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.fullName = "Tirtha";
        c1.age = 40;

        System.out.println("Name: " + c1.fullName);
        System.out.println("Age: " + c1.age);

    }
}