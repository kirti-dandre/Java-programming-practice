import java.util.Scanner;
public class Challenge6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /* Create a program that categorize a person into diffrent age groups if below 13 -- child, below 20 -- teen, below 60 -- adult, above 60 -- senior */

    System.out.println("Welcome here we find our group");
    System.out.print("Please enter your age: ");
    int age = input.nextInt();

    if(age >= 60){
      System.out.println("Hello, senior!");
    }
    else if(age >= 20){
      System.out.println("Hello, adults!");
    }
    else if(age >= 13){
      System.out.println("Hello, teenager!");
    }
    else{
      System.out.println("Hello, child!");
    }
    input.close();
  }  
}
