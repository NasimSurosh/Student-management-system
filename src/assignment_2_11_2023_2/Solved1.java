package assignment_2_11_2023_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solved1 {

  public static void main(String[] args) {

    System.out.println("Welcome to number analysis program!");
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int product = 1;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int input = inputNumber(scan);

    while (input != Exit) {
      sum += input;
      product *= input;
      min = Math.min(min, input);
      max = Math.max(max, input);
      input = inputNumber(scan);
    }
    display(sum, product, min, max);
    scan.close();

  }

  static int Exit = 0;

  public static int inputNumber(Scanner scan) {
    System.out.println("Enter a number or (" + Exit + ") to Exit");
    try {
      return scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Invalid input enter a valid number!");
      scan.next();
      return inputNumber(scan);
    }

  }
  public static void display(int sum, int product, int min, int max) {
    System.out.println("sum is " + sum);
    System.out.println("product is " + product);
    System.out.println("minimum number is " + min);
    System.out.println("maximum number is " + max);
  }

}
