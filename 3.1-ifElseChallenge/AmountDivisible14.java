import java.util.Scanner;

public class AmountDivisible14 {
  static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
  System.out.print("Please enter amount: ");
   int amount = input.nextInt();
  
   if(amount % 100 == 0){
    System.out.println("Amount is evenly divide");
   }else{
    System.out.println("amount is evenly not divide");
   }
input.close();

}
  
  
}
