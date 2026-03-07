import java.util.Scanner;

public class ThreeSides1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take three sides and check if they form valid triangle

    System.out.println("Welcome here we check valid triangle");
    System.out.print("Please enter first side: ");
    float side1 = input.nextFloat();
    System.out.print("Please enter second side: ");
    float side2 = input.nextFloat();
    System.out.print("Please enter third side: ");
    float side3 = input.nextInt();


    if((side1 + side2 > side3) && (side2 + side3 >side1) && (side1 + side3 > side2)){
      System.out.println("This triangle form is valid");
    }
    else{
      System.out.println("This is not valid triangle");
    }
     input.close();
  }
  
}
