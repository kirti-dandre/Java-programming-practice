import java.util.Scanner;
public class Challenge2 {
  public static void main(String[] args) {
    // Create a program to find number is even or odd

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome, here we find number is even or odd");
    System.out.print("Please enter any number: ");
    int num =  input.nextInt();


    if(num %2 == 0){
      System.out.println("Hello,number is even");
    }else{
      System.out.println("Hello, number is odd");
    }
    input.close();
  }
  
}
