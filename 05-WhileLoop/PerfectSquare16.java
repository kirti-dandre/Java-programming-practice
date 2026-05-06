import java.util.Scanner;

public class PerfectSquare16 {
  public class PerfectSquare {
    public static void main(String[] args) {
      // Check whether a number is a perfect square (without using the square root function)

        Scanner sc = new Scanner(System.in);

        int num;
        int i = 1;
        boolean perfect = false;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(i * i <= num) {

            if(i * i == num) {
                perfect = true;
            }

            i++;
        }

        if(perfect == true) {
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not Perfect Square");
        }
        sc.close();
    }
  }
}