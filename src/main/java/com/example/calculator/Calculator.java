package com.example.calculator;

public class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
    
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Квадратный корень из отрицательного числа невозможен");
        }
        return Math.sqrt(value);
    }
}

