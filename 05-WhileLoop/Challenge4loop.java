import java.util.Scanner;

public class Challenge4loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program that computes the sum of the digits of an integer
    System.out.println("Welcome to sum of digits");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    int sum = sumOfDigit(number);
    System.out.println("Sum of digits is: "+sum);
    input.close();

  }
  public static int sumOfDigit(int number) {
     int sum = 0;
     while (number > 0 ) {
      sum = sum + (number % 10);
      number = number / 10; 
     }
  return sum;
  }
  
}
