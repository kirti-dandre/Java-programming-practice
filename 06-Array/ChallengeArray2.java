import java.util.Scanner;

public class ChallengeArray2 {
  public static void main(String[] args) {
    try (// Create a program to find number of occurrences of an element in an array
    Scanner input = new Scanner(System.in)) {
      System.out.println("Welcome to Array occurrence");
      System.out.print("Please enter the size : ");
      int size = input.nextInt();
      int[] numArr = new int[size];
      System.out.print("Please enter the array element: ");
      int i = 0;
      while(i < size){
        numArr[i] = input.nextInt();
        i++;
      }
      System.out.print("Now enter the number you want to find: ");
      int num = input.nextInt();
      int occurrence = noOfoccurrence(numArr, num);
      System.out.println("Your number was found "+ occurrence + " times in the array");
    }
  }
public static int noOfoccurrence(int[] numArr, int num) {
    int occ = 0;
    int i = 0;
    while(i < numArr.length) {
      if (numArr[i] == num){
        occ++;
      }
      i++;
    }
  
  return occ;



}
  
}
