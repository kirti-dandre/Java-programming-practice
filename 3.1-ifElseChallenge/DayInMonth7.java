import java.util.Scanner;

public class DayInMonth7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Take a month number (1 - 12) and print the number of days in that month (ignore leap years)

    System.out.println("Welcome the calander");
    System.out.print("Please enter month number 1 to 12: ");
    int month = input.nextInt();

    if(month == 2){
      System.out.println("Hello, It has 28 days");
    }else if((month == 4) || (month == 9) || (month == 6) || (month == 11)){
      System.out.println("Hello, It has 30 days");
    }else if(month <=1 || month <= 12){
      System.out.println("Hello, It has 31 days");
    }else{
      System.out.println("Invalid month number");
    }
    input.close();
  }
  
}
