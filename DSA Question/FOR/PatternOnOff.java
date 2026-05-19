package FOR;

import java.util.Scanner;

public class PatternOnOff {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = input.nextInt();
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;
        if(sum % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
    input.close();
  }
  
}
