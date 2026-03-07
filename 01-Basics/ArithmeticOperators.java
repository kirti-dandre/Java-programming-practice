import java.util.Scanner;
public class ArithmeticOperators {
  public static void main(String[] args) {
    System.out.println("Welcome to our calculator");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    System.out.print("Now, please enter the number: ");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    float sub = num1 - num2;
    float mul = num1 * num2;
    float div = num1 / num2;
    float mod = num1 % num2;
    System.out.println("Sum of the number is: "+sum);
    System.out.println("Sub of the number is: "+sub);
    System.out.println("Mul of the number is: "+mul);
    System.out.println("div of the number is: "+div);
    System.out.println("modulo of the number is: "+mod);
    input.close();
  }
}
