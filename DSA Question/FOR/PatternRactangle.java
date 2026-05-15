package FOR;

import java.util.Scanner;

public class PatternRactangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number of star in row: ");
    int outer = input.nextInt();
    System.out.print("Number of star in column: ");
    int inner = input.nextInt();
    for (int i = 1; i <= outer; i++) {
      for (int j = 1; j <= inner; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    input.close();
  }
  
}
