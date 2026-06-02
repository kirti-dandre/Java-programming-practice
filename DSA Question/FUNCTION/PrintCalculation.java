package FUNCTION;

import java.util.Scanner;

public class PrintCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    System.out.print(" Now please enter second number: ");
    int num2 = input.nextInt();
    //int sum = calculateSum(num1, num2);
    //System.out.println("Sum of two number: "+ sum);
    double product = calculateProduct(num1, num2);
    System.out.println("Product of two number is: "+ product);
    input.close();

  }
  public static int calculateSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
  }
  public static double calculateProduct(int num1, int num2){
    double product = num1 * num2;
    return product;
  }
  
}
