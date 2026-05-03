public class Initialization {
  public static void main(String[] args) {
    //int[] myArr = new int[4];
    //myArr[0] = 98;
    //myArr[1] = 6;
    //myArr[2] = 8;
    //myArr[3] = 9;

    int[] myArr = {98, 6, 8, 9};

    //System.out.println(myArr[0]);
    //System.out.println(myArr[1]);
    //System.out.println(myArr[2]);
    //System.out.println(myArr[3]);

    // ARRAY  TRAVERSAL
     int index = 0;
     while (index < 4) {      // in the 4 we replace with (myArr.length)
      System.out.println(myArr[index]);
      index++;
     }
  }
  
}
