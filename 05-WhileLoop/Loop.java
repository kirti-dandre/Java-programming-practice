import java.util.Scanner;

public class Loop {
   public static void main(String[] args) {    

    int num = 10;
    while (num <= 20){
      System.out.println("My name is Kirti Dandre");
      num = num + 1;
    }

    // int count = 500;
    // while (count >= 200){
      // System.out.println(count);
      // count -= 1;
    // }

    Scanner input = new Scanner(System.in);
    int i = 0;
    while (i < 5){
      int imp = input.nextInt();
      System.out.println("Number is: "+imp);
      i = i + 1;
    }
    input.close();
   }  
}
