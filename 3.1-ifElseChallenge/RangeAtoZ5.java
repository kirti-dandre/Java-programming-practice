import java.util.Scanner;

public class RangeAtoZ5 {
  public static void main(String[] args) {
    // Take a  alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'
    Scanner input = new Scanner(System.in); 
    System.out.println("Welcome to our alphabet range checker system");
    System.out.print("Please enter your alphabet: ");
    char ch = input.next().charAt(0);

    if((ch >= 'a') && (ch <= 'm' ) || (ch >= 'A') && (ch <= 'M')){
      System.out.println("Your alphabet is lies between A and M");
    }else{
      System.out.println("Your alphabet is lies between N and Z");
    }
    input.close();
  }
}
