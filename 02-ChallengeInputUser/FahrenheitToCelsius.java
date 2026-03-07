import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to our Temperature calculator");
    System.out.print("Please enter your temp in F: ");
    float fahrenheit_tem = input.nextFloat();
    float celsius = (fahrenheit_tem - 32) * 5 / 9;
    System.out.println("Here is your temperature is "+celsius+ "C");
    input.close();
  }
  
}
