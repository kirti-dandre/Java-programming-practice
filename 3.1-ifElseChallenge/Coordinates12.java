import java.util.Scanner;

public class Coordinates12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take coordinates (x and y) and determine which quadrant the point lies in
    
    System.out.println("Welcome in coordinates");
    System.out.print("Please enter x position: ");
    float x = input.nextFloat();
    System.out.print("Now, please enter y position: ");
    float y = input.nextFloat();

    if(x == 0 && y == 0){
      System.out.println("Origin");
    }else if(x == 0){
      System.out.println("y-axis");
    }else if(y == 0) {
      System.out.println("x-axis");
    }
     else if (x > 0 && y > 0){
      System.out.println("1st Quadrant");
    }else if(x < 0 && y > 0){
      System.out.println("2nd Quadrant");
    }else if(x < 0 && y < 0){
      System.out.println("3rd Quadrant");
    }else{
      System.out.println("4th Quadrant");
    }
    input.close();
  }
  
}
