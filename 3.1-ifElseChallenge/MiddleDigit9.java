import java.util.Scanner;

public class MiddleDigit9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Take a 3 digit number and determine if the middle digit is largest, smallest, or neither

    System.out.println("Welcome here we determines middle number is largest , samllest or neither");
    System.out.print("Please enter the 3 digit number: ");
    int number = input.nextInt();

    int a = number % 10;
    number = number / 10;
    int b = number % 10; 
    number = number / 10;
    int c = number % 10;
    if(b > a && b > c ){
      System.out.println("It is largest number: "+b);
    }else if(b < a && b < c){
      System.out.println("It is smallest number: "+b);
    }else{
      System.out.println("It is nor largest neitger smallest number");
    }
  input.close();
  }
}
