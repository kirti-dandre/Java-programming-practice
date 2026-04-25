import java.util.Scanner;

public class RangeNum15 {
  public static void main(String[] args) {
     Scanner input= new Scanner(System.in);

     // Check if a number lies within the range [100, 999]
     System.out.print("Please enter any digit: ");
     int num = input.nextInt();
     if(num >=100 && num <= 999) {
      System.out.println(" Your Number is lies within the range");
     }else{
      System.out.println("Your number is not lied within the range");
     }

   input.close();

  }
  
}
