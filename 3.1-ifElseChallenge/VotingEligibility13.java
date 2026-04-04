import java.util.Scanner;

public class VotingEligibility13 {
  public static void main(String[] args) {
    
    // Check voting eligibility for a given age (18+)

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to voting portal");
    System.out.print("Please enter your age: ");
    int age = input.nextInt();

    if (age >= 18){
      System.out.println("Congrats! You are eligible to vote ");
    }else{
      System.out.println("Sorry, You are not eligible");
    }
  }

}