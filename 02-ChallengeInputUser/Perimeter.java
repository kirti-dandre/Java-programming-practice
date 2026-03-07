import java.util.Scanner;
public class Perimeter {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to our calculator");
  System.out.print("Enter the first edge of ractangle in cm: ");
  double A = input.nextDouble();
  System.out.print("Enter the second edge of ractangle in cm: ");
  double B = input.nextDouble();
  System.out.print("Enter the third edge of ractangle in cm: ");
  double C = input.nextDouble();
  System.out.print("Enter the fourth edge of ractangle in cm: ");
  double D = input.nextDouble();
  double perimeter = A + B + C + D;
  System.out.println("Perimeter of the ractangle is: "+perimeter+"cm");
  input.close();  
  }
}
