import java.util.Scanner;

public class Add {
  public static void main(String[] args) {
    System.out.println("Welcome to my calculator");
    System.out.print("Please enter first number: ");
    Scanner input = new Scanner(System.in);
    int firstNumber = input.nextInt();
    System.out.print("Now Please enter second number: ");
    int secondNumber = input.nextInt();
    int sum = firstNumber + secondNumber;
    System.out.print("sum of your number is: "+ sum);
    input.close();
    }
  
}
