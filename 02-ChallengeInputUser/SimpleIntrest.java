import java.util.Scanner;
public class SimpleIntrest {
  public static void main(String[] args) {
    System.out.println("Welcome to our calculator");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the principal amount in Rs ");
    double p = input.nextDouble();
    System.out.print("Please enter the time: ");
    double t = input.nextDouble();
    System.out.print("Now, please enter the rate of interest: ");
    double r = input.nextDouble();
    double simple_interest = (p * t * r)/100;
    System.out.print("Here is your simple interest: "+simple_interest);
    input.close();
  }
  
}
