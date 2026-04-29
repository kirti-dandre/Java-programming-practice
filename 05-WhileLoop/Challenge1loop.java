import java.util.Scanner;

public class Challenge1loop {
  public static void main(String[] args) {
    // Develop a program that prints the multiplication table for a given number

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Multiplication Table");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    multiplicationTable(number);
    input.close();
  }
  public static void multiplicationTable(int number) {
    int i = 1;
    while (i <= 12) {
      System.out.println(number + "x" + i + " = " + (number * i));
      i++;
    
    }
  } 
}