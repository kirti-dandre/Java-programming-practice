import java.util.Scanner;
public class Challenge2 {
  public static void main(String[] args) {
    // Create a program to find number is even or odd

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome, here we find number is even or odd");
    System.out.print("Please enter any number: ");
    int num1 =  input.nextInt();
    System.out.print("Now, please enter the second number: ");
    int num2 = input.nextInt();


    if((num1 % 2 == 0) && (num2 % 2 == 0)){
      System.out.println("Your both number is even");
    }else if((num1 % 2 != 0) && (num2 % 2 != 0) ){
      System.out.println("Your both number is odd");
    }else if((num1 % 2 == 0) && (num2 % 2 != 0)){
      System.out.println("Your first number is even and second number is odd");
    }else{
      System.out.println("Your first number is odd and second number is even");
    }
    input.close();
  }
  
}
