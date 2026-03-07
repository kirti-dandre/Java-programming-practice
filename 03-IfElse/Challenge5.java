import java.util.Scanner;
public class Challenge5 {
  public static void main(String arg[]){
    Scanner input = new Scanner(System.in);
    /* Create a program that calculates grades based on marks if above 90% -- A, above 75% -- B, above 60% -- C, above 30% -- D, below 30% -- F  */
    System.out.println("Welcome to our grade  calculator");
    System.out.print("Please enter your markes: ");
    float marks = input.nextFloat();

    if(marks > 90){
      System.out.println("Your grade is: "+"A");
    }
    else if(marks > 75){
      System.out.println("Your grade is: "+"B");
    }
    else if(marks > 60){
      System.out.println("Your grade is: "+"C");
    }
    else if(marks >= 30){
      System.out.println("Your grade is: "+"D");
    }
    else{
      System.out.println("Your grade is :"+"F");
    }
    input.close();
  }
}
