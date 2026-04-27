public class Parameter {
  public static void main(String[] args) {
    System.out.println("Here is sum of two number: " + sumTwoNumber(66, 44));
    System.out.println("here is sum of two number: "+ sumTwoNumber(100, 200));
  }
  public static int sumTwoNumber(int first, int second) {
    System.out.println("First number: "+ first);
    System.out.println("Second number: "+ second);
    int sum = first + second;
    return sum;
  }
  
}
