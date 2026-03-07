import java.util.Scanner;
public class AreaTriangle {
  public static void main(String[] args) {
  System.out.println("Welcome to our calulator");
  Scanner input = new Scanner(System.in);
  System.out.print("Please enter the base of the triangle in cms: ");
  double base = input.nextDouble();
  System.out.print("Now, please enter the height of the triangle cms: ");
  double height = input.nextDouble();
  double area = ( base * height)/2;
  System.out.print("Here is your triangle area is: "+area+"cms2");
  input.close();

  }
}
