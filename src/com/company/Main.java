package com.company;

public class Main {
    public static void main(String[] args) {
        employee e = new employee();
        e.setID(6);
        e.setName("Jon lee");
        e.setSalary(60000.00);
        System.out.println(e.getID());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

//        cars c = new cars(name:"BMW", price:30000)

    }
}
