package FOR;

import java.util.Scanner;

public class TableOfNumber {
  public static void main(String[] args) {
    // Print the table of a number input by the user
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    for (int i = 1; i <= 12; i++) {
      int factor = number * i;
      System.out.println(factor);
    }
    input.close();
  }
  
}
