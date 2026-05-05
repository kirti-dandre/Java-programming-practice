import java.util.Scanner;

public class ChallengeArray4 {
  public static void main(String[] args) {
    try (// Create a program to check if the given array is sorted
    Scanner input = new Scanner(System.in)) {
      System.out.println("Welcome in the array sorting check post");
      System.out.print("Please enter the size: ");
      int size = input.nextInt();
      System.out.print("Please enter the element: ");
      int[] sortArr = new int[size];
      int i = 0;
      while (i < sortArr.length) {
        sortArr[i] = input.nextInt();
        i++;
      }
      boolean isIncrease = increasingSorted(sortArr);
      boolean isDecrease = decreasingSorted(sortArr);
      if(isDecrease || isIncrease){
        System.out.println("Your array is sorted");
      }else{
        System.out.println("Your array is not sorted");
      }
    }
  }
  public static boolean increasingSorted (int[]sortArr){
    int i = 1;
    while (i < sortArr.length) {
      if (sortArr[i] < sortArr[i-1]) {
        return false;
      }
      i++;
    }
    
    return true;

  } 
  public static boolean decreasingSorted (int[]sortArr){
    int i = 1; 
    while(i < sortArr.length) {
      if (sortArr[i] > sortArr[i-1]){
        return false;
      }
      i++;
    }
    
    return true;

  }
  
}
