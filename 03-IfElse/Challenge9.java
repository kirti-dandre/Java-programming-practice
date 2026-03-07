import java.util.Scanner;

public class Challenge9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Take a character and check wether it's uppercase, lowrcase, a digit, or a special character 
    
    System.out.println("Welcome, here we check number is uppercase, lowercase or special character");
    System.out.print("Enter any character: ");
    char ch = input.next().charAt(0);

    if(ch >= 'A' && ch <= 'Z'){
      System.out.println("Character is uppercase");
    }
    else if(ch >= 'a' && ch <= 'z'){
      System.out.println("Character is lowercase");
    }
    else if(ch >= '0' && ch <= '9'){
      System.out.println("It is a digit");
    }
    else{
      System.out.println("It is a special character");
    }
    input.close();
  }
  
}
