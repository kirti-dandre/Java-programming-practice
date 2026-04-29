import java.util.Scanner;

public class Challenge3loop {
  public static void main(String[] args) {
    // Write a function that calculate factorial of a given number
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to factorial checker");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    long fact = factorialNumber(number);
    System.out.println(" factorialNumber is: "+ fact  );
    input.close();
  }

  public static long factorialNumber (int number) {
   if(number <2) {
    return 1;
   } 
   long fact = 1;
   int i = 2;
   while (i <= number) {
     fact *= i;
    i++;
   }
   return fact;
  }
}
