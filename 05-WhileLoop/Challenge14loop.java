import java.util.Scanner;

public class Challenge14loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to pattern printing\n");
    System.out.print("Please enter the no of rows: ");
    int row = input.nextInt();
    thirdPattern(row);
    input.close();
 
    
  }
  public static void thirdPattern(int maxRows) {
   int rows = maxRows;
    while (rows > 0) {
      int j = 0;
      // this loop print space
      while (j < rows - 1){
        System.out.print("  ");
        j++;
      }
      // this loop for prints star
      int i = 0;
      while (i <= (maxRows - rows)){
      System.out.print("* ");
      i++;
      }
      System.out.println();
      rows--;
  } 
 }

  
}
