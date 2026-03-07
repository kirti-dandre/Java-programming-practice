import java.util.Scanner;

public class MultipleNum3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Check if one of two given numbers is a multiple of the other 

    System.out.print("Please enter first number: ");
    int numb1 = input.nextInt();
    System.out.print("Now, please enter second number: ");
    int numb2 = input.nextInt();

    if(numb1 % numb2 == 0 || numb2 % numb1 == 0){
      System.out.println("One number is a multiple of other");
    }else{
      System.out.println("One number is not multiple of other");
    }

    input.close();
  }
  
}
