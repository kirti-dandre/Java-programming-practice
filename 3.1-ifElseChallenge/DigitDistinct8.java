import java.util.Scanner;

public class DigitDistinct8 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   // Take a 3 digit number and check if all digit are distinct
   
   System.out.println("Welcome to number checker System");
   System.out.print("Please enter 3 digit number: ");
   int number = input.nextInt();

   int c = number % 10;
   number = number / 10;
   int b = number % 10;
   number = number / 10;
   int a = number % 10;
   System.out.println("Thousands digit: "+a);
   System.out.println("Hundreds digit: "+b);
   System.out.println("Ones digit: "+c);
   if(a != b && b != c && c != a){
    System.out.println("Digits are distict");
   }else{
    System.out.println("Digits are not distict");
   }
  input.close();
  }
  
}
