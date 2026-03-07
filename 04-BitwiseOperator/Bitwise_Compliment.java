import java.util.Scanner;

public class Bitwise_Compliment {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Showcasing bitwise operator");
    System.out.print("Please enter the number: ");
    int num1 = input.nextInt();
    int result = ~num1;
    System.out.println("Here is your number: "+ result);
    input.close();
  }
  
}
