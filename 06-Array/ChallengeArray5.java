import java.util.Scanner;

public class ChallengeArray5 {
  public static void main(String[] args) {
  try (Scanner input = new Scanner(System.in)) {
    // Create a program to return a new array deleting a specific element
    System.out.println("Welcome to Array Deletion");
    System.out.println("Please enter the size: ");
    int size = input.nextInt();
    System.out.println("Please enter an element of array: ");
    int[] delArr = new int[size];
    int i = 0;
    while (i < delArr.length) {
      delArr[i] = input.nextInt();
      i++;
    }
    System.out.println("Now, enter the number you want to delete: ");
    int numToDelete = input.nextInt();
    int[] newArr = deleteNumber(delArr, numToDelete);
    System.out.println("Here is your new element no "+ (i + 1)+ ": ");
    delArr[i] = input.nextInt();
    i++;
  }
  return delArr;
}
public static int[] deleteNumber(int[]delArr, int numTodelete){
  
  
  return 0;
}
  
}
