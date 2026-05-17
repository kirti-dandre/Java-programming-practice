package FOR;

import java.util.Scanner;
public class InversePyramid {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Please enter the number: ");
  int number = input.nextInt();
  for(int i = number; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
      System.out.print("*");
    }
    System.out.println();
  }
  input.close();
}


  
}
