import java.util.Scanner;
public class Challenge3 {
  public static void main(String[]arg){

  // Create a program that determines the greatest of the three numbers
  
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to our number checker");
    System.out.print("Enter any three numbers: ");
    float num1 = input.nextFloat();
    //System.out.println("\t");
    float num2 = input.nextFloat();
    //System.out.println("\t");
    float num3 = input.nextFloat();
    

    if((num1 >= num2) && (num1 >= num3) ){
      System.out.println("This number is greatest number: "+num1);
    }
    else if(num2 >= num3){
      System.out.println("This number is greatest number: "+num2);
    }
    else{
      System.out.println("This number is greatest number: "+num3);
    }
    input.close();
  }
}
