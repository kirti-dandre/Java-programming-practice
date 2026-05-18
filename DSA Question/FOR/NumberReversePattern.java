package FOR;

import java.util.Scanner;

public class NumberReversePattern {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number- i + 1; j++) {
        System.out.print(j+ " ");
      }
      System.out.println();
    }
    input.close();
  }
  
}
