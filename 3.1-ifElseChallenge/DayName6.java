import java.util.Scanner;

public class DayName6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take a day number (1 -7) and print corresponding day name

    System.out.println("Welcome to our day checker system");
    System.out.print("Please enter the number in range 1 to 7: ");
    int number = input.nextInt();

    if(number == 1){
      System.out.println("Hello, it's Monday!");
    }else if(number == 2){
      System.out.println("Hello, its Tuesday!");
    }else if(number == 3){
      System.out.println("Hello, it's Wednesday!");
    }else if(number == 4){
      System.out.println("Hello, it's Thursday!");
    }else if(number == 5){
      System.out.println("Hello, it's Friday!");
    }else if(number == 6){
      System.out.println("Hello, it's Saturday!");
    }else{
      System.out.println("Hello, it's Sunday!");
    }
    input.close();
  }
  
}
