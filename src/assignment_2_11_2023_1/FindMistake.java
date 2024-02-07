package assignment_2_11_2023_1;

import java.util.Scanner;

public class FindMistake {

  public static void main(String[] args) {

    System.out.println("Welcome to the Simple Calculator!");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    System.out.println("Select an operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    int choice = scanner.nextInt();

    int result = 0;
    if (choice == 1) {
        result = num1 + num2;
    } else if (choice == 2) {
        result = num1 - num2;
    } else if (choice == 3) {
        result = num1 * num2;
    } else if (choice == 4) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    } else {
        System.out.println("Invalid operation.");
    }

    System.out.println("Result: " + result);

    scanner.close();
}
}

