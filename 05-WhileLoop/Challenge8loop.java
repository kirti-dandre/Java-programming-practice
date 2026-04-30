import java.util.Scanner;

public class Challenge8loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to reverse the digits of a number
    System.out.println("Welcome to show reverse number");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    int reverseNumber = reverseNumber(number);
    System.err.println("Reverse of your number is: "+reverseNumber);
    input.close();
  }
  public static int reverseNumber(int number) {
    int newnum = 0;
    while (number > 0) {
      int digits = number % 10;
      newnum = newnum *10 + digits;
      number = number / 10;
    }
  return newnum;
  }
  
}
