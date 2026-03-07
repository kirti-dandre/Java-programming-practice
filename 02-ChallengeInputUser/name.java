
import java.util.Scanner;
public class name {
  public static void main(String[] args) {
    System.out.print("Please enter your name: ");
    var input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.print( "Welcome "+name+" to Coding Challenge");
    input.close();
  } 
}
