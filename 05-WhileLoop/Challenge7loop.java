import java.util.Scanner;

public class Challenge7loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to check whether a given number is prime 
  System.out.println("Welcome to prime number checker");
  System.out.print("Please enter the number: ");
  int number = input.nextInt();
  boolean primeNumber = primeNumber(number);
  if (primeNumber){
    System.out.println("Your number is prime");
  }else {
    System.out.println("Your number is not prime");
  }
  input.close();
  }
  public static boolean primeNumber(int number){
    int i = 2;
    while(i < number){
      if (number % i == 0){
        return false;
      }
      i++;
    }
  return true;
  }
}
