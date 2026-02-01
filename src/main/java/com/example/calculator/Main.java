package com.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Калькулятор ===");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("15 / 3 = " + calc.divide(15, 3));
        System.out.println("2 ^ 8 = " + calc.power(2, 8));
        System.out.println("√16 = " + calc.sqrt(16));
    }
}

