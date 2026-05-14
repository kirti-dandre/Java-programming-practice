package FOR;

import java.util.Scanner;

public class Even { 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
      System.out.print("Please enter the number: ");
    int number = input.nextInt();
    for(int i = 2; i <= number; i=i+2) {
     System.out.println(" Here is the even number: " + i);
    }
    input.close();
  }
  
}
