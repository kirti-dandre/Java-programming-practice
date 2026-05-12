import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    // Print number in n 
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    int i = 0;
    while(i <= number) {
      System.out.println(i);
      i++;
    }
    input.close();
  }
  
}
