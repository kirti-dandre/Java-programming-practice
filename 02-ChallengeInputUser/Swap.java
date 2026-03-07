import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
  int a = 5; 
 // System.out.println(a);
  int b = 10;
  //System.out.println(b);
  int c = a;
  a = b;
  b = c;
  System.out.println(a);
  System.out.println(b);

  //if we want user input
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Swapping Station ");
  System.out.print("Please enter the value of A: ");
  int add = input.nextInt();
  System.out.print("Please enter the value of B: ");
  int sub = input.nextInt();
  int mull = a;
  add = sub;
  sub = mull;
  System.out.println("The value of A is: "+add);
  System.out.println("The value of B is: "+sub);
  }
  }
