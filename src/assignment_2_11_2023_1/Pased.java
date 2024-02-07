package assignment_2_11_2023_1;

import java.util.Scanner;

public class Pased {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to the Simple Calculator!");
      System.out.print("Enter the first number: ");
      int num1 = getIntegerInput(scan);
      System.out.print("Enter the second number: ");
      int num2 = getIntegerInput(scan);

      System.out.println("Select an operation:");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");

      int choice = getIntInput(scan);

      int result = 0;
      try {
        switch (choice) {
        case 1:
          result = num1 + num2;
          break;
        case 2:
          result = num1 - num2;
          break;
        case 3:
          result = num1 * num2;
          break;
        case 4:
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            System.out.println("Division by zero is not allowed.");
          }
          break;
        default:
          System.out.println("Invalid operation.");
          break;
        }

        System.out.println("Result: " + result);

        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String continueCalculation = scan.next().toLowerCase();
        if (!continueCalculation.equals("yes")) {
          break;
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    scan.close();
  }

  private static int getIntegerInput(Scanner scan) {
    while (true) {
      try {
        return Integer.parseInt(scan.next());
      } catch (NumberFormatException e) {
        System.out.print("Invalid Please enter a valid number: ");
      }
    }
  }

  private static int getIntInput(Scanner scan) {
    while (true) {
      try {
        return Integer.parseInt(scan.next());
      } catch (NumberFormatException e) {
        System.out.print("Invalid Please enter a valid number: ");
      }
      /*
       * Method Decomposition: The code should be divided into smaller, more focused
       * methods. For example, a method for getting user input, another for performing
       * calculations, and another for displaying the result.
       * 
       * Input Validation: Add input validation to ensure that the user enters valid
       * numbers and that division by zero is not allowed.
       * 
       * Use a Switch Statement: Instead of a series of if-else statements for
       * choosing the operation, use a switch statement for better readability and
       * maintainability.
       * 
       * Exception Handling: Instead of using a simple if-else statement for division
       * by zero, use a try-catch block to handle exceptions. This makes the code more
       * robust.
       * 
       * Prompt for Calculation Repeat: Allow the user to perform multiple
       * calculations in a loop, so they don't need to restart the program every time.
       */
    }
  }
}
