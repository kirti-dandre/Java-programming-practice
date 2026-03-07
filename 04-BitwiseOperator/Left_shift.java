import java.util.Scanner;

public class Left_shift {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Showcasing leftshift bitwise operator");
    System.out.print("Please enter the number: ");
    int num = input.nextInt();
    int result = num << 4;
    System.out.println("Here is your number: "+ result);
    input.close();
  }
  
}
