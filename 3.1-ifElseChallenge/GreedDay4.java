import java.util.Scanner;

public class GreedDay4 {
  public static void main(String[] args) {

    // Take the hour of the day (0 - 23) and print"Good Morning", "Good Afternoon","Good Evening",or "Good Night"

    System.out.println("Welcome to our clock");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter hour: ");
    int hour = input.nextInt();

    if(hour < 12){
      System.out.println("Good Morning!");
    }else if(hour < 17){
      System.out.println("Good Afternoon!");
    }else if(hour < 21){
      System.out.println("Good Evening!");
    }else {
      System.out.println("Good Night!");
    }

  }
  
}
