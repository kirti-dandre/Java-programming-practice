import java.util.Scanner;

public class Challenge4 {
  public static void main(String arg[]){
    /*Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400) */
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to our leap year checker calculator");
    System.out.print("Please enter year: ");
    int year = input.nextInt();

    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
      System.out.println("This year is a leap year: "+year);
    }else{
      System.out.println("This year is not a leap year : "+year);
    }
    input.close();
  }
     
}
