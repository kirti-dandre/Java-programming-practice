import java.util.Scanner;

public class ReturnStatement {
  public static void main(String[] args) {
    patternPrinting();
    int first = firstNumber() +1;
    int second = secondNumber() +2;
    int sum = first + second;
    System.out.println("Sum of the number is: "+sum);

  }
  public static void patternPrinting(){
    System.out.println("Good Morning!");

  }
  public static int firstNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    return number;
  }
   public static int secondNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    return number;
}

}
