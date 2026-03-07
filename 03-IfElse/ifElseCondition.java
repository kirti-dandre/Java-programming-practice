public class ifElseCondition {
  public static void main(String[] args) {
    boolean isMale = true;
    String name = "raja";
    System.out.println("before if");
    if(isMale){
      System.out.println("Mr."+name);
    }else {
      System.out.println("Ms."+name);
    }
    System.out.println("after else");
    System.out.println("\n\n");


  boolean isSeniorCitizen = false;
  boolean isAnAdult = false;
  if(isSeniorCitizen){
    System.out.println("Hello, Senior citizen!");
  }else {
    if(isAnAdult){
      System.out.println("Hello, Adults!");
    }else{
      System.out.println("Hello, child!");
  }
  }
 }
}