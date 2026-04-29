import java.util.Scanner;

public class DigitEqual10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take a 4- digit number and check if the first and last digit are equal

    System.out.println("Welcome let's find digits are same or not");
    System.out.print("Please enter 4 digit number: ");
    int number = input.nextInt();

    int a = number % 10;
    number = number / 10;
    int b = number % 10;
    number = number /10;
    int c = number % 10;
    number = number / 10;
    int d = number % 10;
    input.close();

    if(a == d){
      System.out.println("First and Last digit is equal");
    }else{
      System.out.println("First and Last number is not equal");
    }
    input.close();
  }
  
}
