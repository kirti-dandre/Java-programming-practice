import java.util.Scanner;

public class Operations {
  public static void main(String[] args) {
    double a = 100;
    double b = 30;
    double sum = a + b;
    double sub = a - b;
    double mul = a * b;
    double div = a / b;
    double mod = a % b;
    System.out.println("Sum of the numbers is: "+sum);
    System.out.println("Subtraction of the numbers: "+sub);
    System.out.println("Multiplication of the numbers: "+mul);
    System.out.println("Division of the number is: "+div);
    System.out.println("modulo of the number is: "+mod);
    System.out.println("\n");
    

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the  first number: ");
    float num1 = input.nextFloat();
    System.out.print("Now, please enter the second number: ");
    float num2 = input.nextFloat();
    float product1 = num1 * num2;
    System.out.print("Here is product of two number: "+product1);


    //Product of two floating point numbers
    float number1 = (float) 20.44;
    float number2 = (float) 10.22;
    float product = number1 * number2;
    System.out.println(product);
  input.close();
  }
}
