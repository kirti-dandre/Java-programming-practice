import java.util.Scanner;

public class TriangleType2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Check sides form valid triangle, determine whether it is equilateral, isosceles or seclene 

    System.out.println("Welcome here we determine triangle is equilateral, isosceles or scalene");
    System.out.print("Please enter three sides: ");
    float side1 = input.nextInt();
    float side2 = input.nextInt();
    float side3 = input.nextInt();


  if ((side1 + side2 > side3)  && (side2 + side3 > side1) && (side3 + side1 > side2)){
    System.out.println("This is valid triangle");
   if((side1 == side2) && (side2 == side3)) {
    System.out.println("This is an equilateral triangle");
  }
  else if((side1 == side2) || (side3 ==side1) || (side2 == side3)){
    System.out.println("This is an isosceles triangle");
  }
  else{
    System.out.println("This is a scalence triagle");
  }
}
  else {
    System.out.println("It is not triangle");
  }
  input.close();
  }
}
  

