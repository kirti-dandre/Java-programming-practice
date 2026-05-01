import java.util.Scanner;

public class Challenge12loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to pattern printing\n");
    System.out.print("Please enter the no of rows: ");
    int row = input.nextInt();
    firstPattern(row);
    input.close();
 
  }
  public static void firstPattern(int maxRows) {
    int rows = 0;
    while (rows < maxRows) {
      System.out.print("*");
      int i = 0;
      while (i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;
    }
  }
  
}
