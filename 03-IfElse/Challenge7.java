import java.util.Scanner;

public class Challenge7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Check number is divisible by both 3 and 5
    System.out.println("Welcome to our number checker system");
    System.out.print("Please enter a number: ");
    int number = input.nextInt();

    if((number % 3 == 0) && ( number % 5 ==0)){
      System.out.println("Your number is divisibe by both 3 and 5");
    }
    else{
      System.out.println("Your number is not divisible");
    }
    input.close();
  }
  
}
