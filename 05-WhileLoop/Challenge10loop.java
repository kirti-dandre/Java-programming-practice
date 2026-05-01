import java.util.Scanner;

public class Challenge10loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to check if a number is a Armstrong number
    System.out.println("Welcome to Armstrong number");
    System.out.print("Please enter your number: ");
    int number = input.nextInt();
    boolean isArmstronge = isArmstrong(number);
    if (isArmstronge) {
      System.out.println("Your number is armstrong number");
    }else {
      System.out.println("Your number is not armstrong number");
    } input.close();

  }
  public static boolean isArmstrong (int number) {
    int noOfDigits = noOfDigits(number);
    int numcopy = number;
    System.out.println("No of Digits: "+ noOfDigits);
    int finalNumber = 0;
    while (number > 0) {
      int lastDigits = number % 10;
      number = number / 10; 
      finalNumber += pow(lastDigits, noOfDigits);
    }
    return finalNumber == numcopy;
  }
  public static int pow(int number1, int number2) {
    int result = 1;
    int i = 0; 
    while (i < number2) {
      result = result * number1;
      i++;
    }
    System.out.println("Power of "+ number1 +" is"+result);
    return result;
  }

  public static int noOfDigits(int number) {
    int digits = 0; 
    while (number > 0) {
      digits ++;
      number = number / 10;
    }
    return digits;
  }
  
}
