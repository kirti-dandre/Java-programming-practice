import java.util.Scanner;
public class Challenge1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Create a program that determines if a number is positive, negative, or zero

    System.out.println("Welcome, here we determine number is positive, negative, or zero");
    System.out.print("Please enter any number: ");
    float number = input.nextFloat();

    if(number == 0){
      System.out.println("Your number is zero");
    }else if(number<0){
      System.out.println("Your number is Negative");
    }else if(number>0){
      System.out.println("Your number is Positive");
    }else{
      System.out.println("Number not determines");
    }
    input.close();
  }
  
}
