public class CarInstanceVariable {
  int noOfWhiles;
  String color;
  float maxSpeed;
  float currentFuelInLiters;
  int noOfSeats;

  public void drive() {
    System.out.println("Car is driving");
    currentFuelIntLiters--;
  }
  public void addFuel(float fuel){
    currentFuelInLiters += fuel;
  }
  public float getCurrentFuelLevel() {
    return currentFuelLevel;

  }
  public static void main(String[] args) {
    Car mycar = new Car();
  }
}
