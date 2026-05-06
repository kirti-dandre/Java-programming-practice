import java.util.Scanner;

public class Angle15 {
  public static void main(String[] args){
    // Take two angles of a triangle and compute the third angle

        Scanner sc = new Scanner(System.in);

        int angle1, angle2, angle3;

        System.out.print("Enter first angle: ");
        angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        angle2 = sc.nextInt();

        angle3 = 180 - (angle1 + angle2);

        System.out.println("Third angle is: " + angle3);
        sc.close();
    }

}
  
