import java.util.Scanner;

public class Challenge13loop {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    System.out.println("Welcome to pattern printing\n");
    System.out.print("Please enter the no of rows: ");
    int row = input.nextInt();
    secondPattern(row);
    input.close();
} 
public static void secondPattern(int maxRows) {
   int rows = maxRows;
    while (rows > 0) {
      System.out.print("*");
      int i = 0;
      while (i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows--;
  } 
 }
}