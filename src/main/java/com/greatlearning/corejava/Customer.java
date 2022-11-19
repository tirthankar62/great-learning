package com.greatlearning.corejava;

class Customer {

    Customer(){

        this(1);

        System.out.print(" hello");

    }

    Customer(int x){

        System.out.print("hi");

    }

}



class Main {

    public static void main(String args[]) {

        Customer customer = new Customer();

    }

}


