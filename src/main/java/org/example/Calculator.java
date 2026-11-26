package org.example;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a / b;
    }
    public double remainderFromDivide(double a, double b){
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a % b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public double difference(double a, double b) {
        return a - b;
    }
}