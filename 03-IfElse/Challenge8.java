import java.util.Scanner;

public class Challenge8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Take a character and check if it's vowel or consonant 
    System.out.println("Welcome to Alphabet World, here we check character is vowel or consonant");
    System.out.print("Enter a character: ");
    char ch = input.next().charAt(0);

    if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
      System.out.println("It is a vowel");
    }
    else{
      System.out.println("It is a consonant");
    }
    input.close();

  }
  
}
