import java.util.Scanner;

public class MultipleOf7And11 {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    // Check if a number is a multiple of 7 or end with 7

    System.out.println("Welcome here we check number is multiple of 7 or end with 7");
    System.out.print("Please enter a number: ");
    int multipleSeven = input.nextInt();
    
    if(multipleSeven % 7 == 0){
      System.out.println("This number is multiple of seven");
    }else if(multipleSeven % 10 == 7){
      System.out.println("This number is end with seven");
    }
    else{
      System.out.println("This number is not multiple of seven");
    }
    input.close();
  }
  
}
