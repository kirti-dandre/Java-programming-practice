import java.util.Scanner;

public class ChallengeArray1 {
  public static void main(String[] args) {
    // Create a program to find the sum and average of the elements in an array
    System.out.println("Welcome to Array Sum and Average");
    int[] inputArray = inputArray();
    long sum = sum(inputArray);
    double average = average(inputArray);
    System.out.println("Sum of the number is: "+sum);
    System.out.println("Average of the number is: "+ average);

  }
  public static int[] inputArray() {
   try (Scanner input = new Scanner(System.in)) {
    System.out.println("Welcome to Array Sum and Average");
    System.out.print("Please enter the number of elements: ");
    int size = input.nextInt();
    int[] number = new int[size];
    int i = 0;
    while (i < size) {
      System.out.print("Please enter element no "+ (i + 1) +": ");
      number[i] = input.nextInt();
      i++;
    }
    return number;
   }
    }
  public static long sum(int[] inputArray) {
    long sum = 0;
    int i = 0;
    while(i < inputArray.length){
      sum += inputArray[i];
      i++;
    }
    return sum;
  }
  public static double average(int[] inputArray){
    double sum = sum(inputArray);
    double average = (sum / inputArray.length);
    return average;
  }
  
}

