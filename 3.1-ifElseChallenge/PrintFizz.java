import java.util.Scanner;

public class PrintFizz {
  public static void main(String[] args) {
  // Take a number and print "Fizz" if divides by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("Number is not divisible by 3 or 5");
        }sc.close();
    }
  
}
