package FOR;

import java.util.Scanner;

public class SumOfNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Print sum of n number
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    int sum = 0;
    for(int i = 1; i <= number; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
    input.close();
  }
  
}
