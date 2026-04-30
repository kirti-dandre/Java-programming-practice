import java.util.Scanner;

public class Challenge6loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to find the greatest common divisor (gcd) of two intergers
    System.out.println("Welcome to GCD of two number");
    System.out.print("Please enter the  first number: ");
    int number1 = input.nextInt();
    System.out.print("Please enter the second number: ");
    int number2 = input.nextInt();
    int gcd = gcdOfTwoNumber(number1, number2);
    System.out.println("GCD of two number is: "+ gcd);
    input.close();
  }
  public static int gcdOfTwoNumber(int number1, int number2) {
    int gcd = 1;
    int i = 2;
    int least = least(number1, number2);
    while (i <= least) {
      if (number1 % i == 0 && number2% i == 0){
        gcd = i;
      }
      i++;
    }
    return gcd;
  }
  public static int least(int number1, int number2){
    if (number1 < number2){
      return number1;
    }else{
      return number2;
    }
  }
  
}
