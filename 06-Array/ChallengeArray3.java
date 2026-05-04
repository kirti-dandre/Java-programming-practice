import java.util.Scanner;

public class ChallengeArray3 {

  public static void main(String[] args) {
    try (// Create a program to find the maximum and minimum element in an array
    Scanner input = new Scanner(System.in)) {
      System.out.println("Welcome to the Array to find max and min");
      System.out.print("Please enter the size for Array: ");
      int size = input.nextInt();
      System.out.print("Please enter the elements: ");
      int[] maxArr = new int[size];
      int i = 0;
      while (i < maxArr.length) {
        maxArr [i] = input.nextInt();
        i++; 
      }
      int max = max(maxArr);
      int min = min(maxArr);
      System.out.println("Max of the array is: "+ max);
      System.out.println("Min of the array is: "+min);
    }

  }
  public static int max( int[] maxArr) {
    if (maxArr.length == 0){
      return Integer.MIN_VALUE;
    }
    int max = maxArr[0];
    int i = 1;
    while (i < maxArr.length) {
      if (max < maxArr[i]) {
        max = maxArr[i];
      }
      i++;
    }
    return max;
  }
   public static int min( int[] maxArr) {
    int min = Integer.MAX_VALUE;
    int i = 0;
    while (i < maxArr.length){
      if (min > maxArr[i]){
        min = maxArr[i];
      }
      i++;
    }
    return min;
  }
  
}
