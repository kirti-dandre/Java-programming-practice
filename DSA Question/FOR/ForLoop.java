package FOR;
import java.util.Scanner;
public class ForLoop {
  public static void main(String[] args) {
    //Print hello in n time
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number that to want print hello world: ");
    int number = input.nextInt();
    for(int i = 0; i < number; i ++) {
      System.out.println("Hello Word!");
    }
    input.close();
  }
}
