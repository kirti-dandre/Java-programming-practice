import java.util.Scanner;

public class RelationlOperator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Driving License Portal");
    System.out.print("Please enter your age: ");
    int age = input.nextInt();
    if(age>=18){
      System.out.println("You are eligible for license ");
    }else{
      System.out.println("Sorry, You are not eligible for license");
    }
    input.close();
  }
  
}
