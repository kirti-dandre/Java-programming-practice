public class TwoDimentionalArray {
  public static void main(String[] args) {
    int[][] myArr = new int[2][4];
    myArr[0][0] = 9;
    System.out.println(myArr[0].length);


    int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    System.out.println(arr.length);
    //System.out.println(arr[0].length);

    //Traversal
    int i = 0;
    while (i < arr.length) {
      int j = 0;
      while (j <arr[i].length){
        System.out.print(arr[i][j]+ " ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
  
}
