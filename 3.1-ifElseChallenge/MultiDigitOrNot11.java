import java.util.Scanner;

public class MultiDigitOrNot11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Take whether a given integer is single digit, double digit or multi digit

    System.out.println("Welcome let's find integer is single digit, double digit, or multi digit");
    System.out.print("Please enter any number: ");
    int number = input.nextInt();

    // Math.abs(number) is convert negative number to positive number
    number = Math.abs(number);

    if(number <= 9){
      System.out.println("Number is single digit");
    }else if(number <=99){
      System.out.println("Number is double digit");
    }else{
      System.out.println("Number is multi digit");
    }input.close();
  }
}
