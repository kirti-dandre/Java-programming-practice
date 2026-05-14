package FOR;

import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, marks;

        do {
            System.out.print("Enter 1 to continue and 0 to stop:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter marks:");
                marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } 
                else if (marks >= 60) {
                    System.out.println("This is also Good");
                } 
                else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } 
                else {
                    System.out.println("Invalid Marks");
                }
            }
        
        } while (choice != 0);
        sc.close();
    }
  
}
