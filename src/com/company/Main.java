package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Vor dem Methodenaufruf!");
        int resultFromMethodDoSomething = doSomething(30, 50);
        System.out.println(resultFromMethodDoSomething);
        System.out.println("Nach dem Methodenaufruf!");

    }

    public static int doSomething(int number1, int number2) {

        int result = number1 + number2;
        return result;

    }

}
