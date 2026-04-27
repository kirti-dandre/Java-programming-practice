public class Methods {
  public static void main(String[] args) {
    System.out.println("In main method");
    greeting();
    System.out.println("Method calling complete");
    printFirstPattern();
    printSecondPattern();
    
  }
  public static void greeting(){
    System.out.println("Good Morning");
  }
  public static void printFirstPattern() {
    int row = 0;
    while (row < 5) {
    System.out.print("*");
    int i = 0;
    while(i < row) {
      System.out.print(" *");
      i++;
    }
    System.out.println();
    row++;
    }
  }
  public static void printSecondPattern() {
    int row = 0;
    while(row < 5){
      System.out.println();
      int i = 5;
      while( i >= row){
        System.out.print(" *");
        i--;
      } 
      row++;


    }
  }
  
}
