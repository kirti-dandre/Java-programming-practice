import java.util.Scanner;

public class And_Operator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Showcasing of bitwise operator");
    System.out.print("Please enter your number: ");
    int num1 = input.nextInt();
    System.out.print("Now, enter other number: ");
    int num2 = input.nextInt();

    int result = num1 & num2;
    System.out.println("Here is your bitwise number: "+result);
    input.close();
  }
  
}
