package Task1;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите второе число (b): ");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            int sum = a + b;
            int difference = a - b;
            int product = a * b;

            System.out.println("Сумма: " + a + " + " + b + " = " + sum);
            System.out.println("Разность: " + a + " - " + b + " = " + difference);
            System.out.println("Произведение: " + a + " * " + b + " = " + product);

            scanner.close();
        }
    }

