import java.util.Scanner;
public class CompoundInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to our calculator");
    System.out.print("Please enter your principal amount in Rs ");
    float principal = input.nextFloat();
    System.out.print("Now, please enter your rate of interest: ");
    float rate = input.nextFloat();
    System.out.print("Now, please enter your time: ");
    float time = input.nextFloat();
    final double compound_interest = principal * Math.pow((1 + rate / 100),time);
    System.out.print("Here is your compound interest : "+compound_interest);
    input.close();

  }
}
