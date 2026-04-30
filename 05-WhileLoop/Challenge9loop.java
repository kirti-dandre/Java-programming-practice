import java.util.Scanner;

public class Challenge9loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create a program to print the Fibonacci series up to certain number
    System.out.println("Welcome to fibonacci series");
    System.out.print("Please enter the number: ");
    int number = input.nextInt();
    System.out.println("Here is the fibonacci series");
    printFibonacciSeries(number);
    input.close();
  }
 public static void printFibonacciSeries(int number) {
  if (number < 0) return;
  System.out.print("0 ");
  if (number == 0) return;
  System.out.print("1 ");
  int first = 0 , second = 1;
  while (first + second <= number) {
    int third = first + second;
    System.out.print(third +" ");
    first = second;
    second = third;

  } 

 }  
}
