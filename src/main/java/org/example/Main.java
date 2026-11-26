package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Выберите операцию (1-6), выход - 0: ");

            int choice = (int) readDouble(scanner);

            if (choice == 0) {
                running = false;
                System.out.println("Выход.");
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Такой операции нет, попробуйте снова.");
                continue;
            }

            if (choice == 6) {
                System.out.print("Введите целое число: ");
                int a = (int) readDouble(scanner);
                System.out.println("Чётное? " + calc.isEven(a));
                System.out.println();
                continue;
            }

            System.out.print("Введите первое число: ");
            double a = readDouble(scanner);

            System.out.print("Введите второе число: ");
            double b = readDouble(scanner);

            try {
                switch (choice) {
                    case 1 -> System.out.printf("Результат: %.2f%n", calc.add(a, b));
                    case 2 -> System.out.printf("Результат: %.2f%n", calc.difference(a, b));
                    case 3 -> System.out.printf("Результат: %.2f%n", calc.multiply(a, b));
                    case 4 -> System.out.printf("Результат: %.2f%n", calc.divide(a, b));
                    case 5 -> System.out.printf("Остаток от деления: %.2f%n", calc.remainderFromDivide(a, b));
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== Калькулятор ===");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.println("5 - Остаток от деления");
        System.out.println("6 - Проверка на чётность (введите целое)");
    }

    private static double readDouble(Scanner scanner) {
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.print("Пустой ввод. Введите число: ");
                continue;
            }
            line = line.replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Это не число. Попробуйте ещё раз: ");
            }
        }
    }
}