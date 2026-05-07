import java.util.Scanner;

public class Meadian {
   public static void main(String[] args) {
  // Take three numbers and print meadian value (neither maximum nor minimum)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("Median = " + a);
        }
        else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("Median = " + b);
        }
        else {
            System.out.println("Median = " + c);
        }sc.close();
    }
    
  
}
