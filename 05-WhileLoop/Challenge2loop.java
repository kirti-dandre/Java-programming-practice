import java.util.Scanner;

public class Challenge2loop {
  public static void main(String[] args) {
    // Create a program to sum of all odd numbers from 1 to N number
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome here is sum of an odd number 1 to N number");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    int sum = sumOfOddNumber(number);
    System.out.println("OddSum till "+ number + " is "+ sum);
    input.close();
  }
  public static int sumOfOddNumber(int number) {
     int  sum = 0;
     int i = 1;
    while (i <= number) {
      sum = sum + i;
      i += 2;
    }
      return sum;
    }
  }
