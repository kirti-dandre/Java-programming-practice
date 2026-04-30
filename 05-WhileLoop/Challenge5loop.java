import java.util.Scanner;

public class Challenge5loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to find the least common multiple (LCM) of two numbers
    System.out.println("Welcome to Lcm cheker");
    System.out.print("Please enter the first number: ");
    int number1 = input.nextInt();
    System.out.print("Please enter the second number: ");
    int number2 = input.nextInt();
    int lcm = twoNumberLcm(number1, number2);
    System.out.println("LCM of two number is: "+ lcm);


  input.close();
  }
  public static int twoNumberLcm(int number1, int number2){
    int i = 1;
    while (i <= number2){
      int factor = number1 * i;
      if (factor % number2 == 0){
        return factor;
      }
      i++;
    }
  return 0; // unreachable
  }

  
}
