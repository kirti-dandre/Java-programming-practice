import java.util.Scanner;

public class Right_shift {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to showcase of right shift bitwise operator");
    System.out.print("Please enter the number: ");
    int num = input.nextInt();
    int result = num >> 1;
    System.out.println("Here is bitwise number: "+result);
    input.close();
  }
}
