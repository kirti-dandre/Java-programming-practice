import java.util.Scanner;

public class Challenge11loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to verify if a number is a palindrome 
    System.out.println("Welcome here we verify number is palindrome");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    boolean isPalindrome = isPalindrome(number);
    if (isPalindrome) {
      System.out.println("Your number is palindrome number");
    }else {
      System.out.println("Your number is not palindrome number");
    }
    input.close();
  }

  public static boolean isPalindrome (int number) {
    int reverse = reverse(number);
    return number == reverse;
  }
  public static int reverse (int number) {
    int newNum = 0;
    while (number > 0) {
      int digit = number % 10;
      newNum = newNum * 10 + digit;
      number /= 10;
    }
    return newNum;
  }
}
