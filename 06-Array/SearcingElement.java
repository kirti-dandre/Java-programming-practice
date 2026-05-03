import java.util.Scanner;

public class SearcingElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // searching element in array
    int[] arr = {1, 3, 9, 6, 7, 10, 2, 4, 15, 17, 13, 5, 12};
    System.out.println("Welcome to Array Searching\n");
    System.out.print("Enter the number you want to search: ");
    int number = input.nextInt();
    boolean isFound = isFound(arr, number);
    if(isFound){
      System.out.println("Your number was found in the array");
    } else{
      System.out.println("Your number was not found in the array");
    }

    input.close();
  }

  public static boolean isFound(int[] arr, int number) {
    int index = 0;
    while (index < arr.length) {
      if(arr[index] == number){
        return true;
      }
      index++;
    }
    return false;

  }
}
