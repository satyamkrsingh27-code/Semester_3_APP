class Vehicle {
  String vehicleNumber;
  String brand;
  int speed;

  Vehicle(String vehicleNumber, String brand, int speed) {
    this.vehicleNumber = vehicleNumber;
    this.brand = brand;
    this.speed = speed;
  }

  void displayDetails() {
    System.out.println("Vehicle Number: " + vehicleNumber);
    System.out.println("Brand: " + brand);
    System.out.println("Speed: " + speed + " km/h");
  }
}

class Car extends Vehicle {
  int numberOfDoors;

  Car(String vehicleNumber, String brand, int speed, int numberOfDoors) {
    super(vehicleNumber, brand, speed);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  void displayDetails() {
    System.out.println("\n--- Car Details ---");
    super.displayDetails();
    System.out.println("Number of Doors: " + numberOfDoors);
  }
}

class Bike extends Vehicle {
  boolean hasGear;

  Bike(String vehicleNumber, String brand, int speed, boolean hasGear) {
    super(vehicleNumber, brand, speed);
    this.hasGear = hasGear;
  }

  @Override
  void displayDetails() {
    System.out.println("\n--- Bike Details ---");
    super.displayDetails();
    System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
  }
}

public class VehicleRental {
  public static void main(String[] args) {

    // Parent class reference
    Vehicle vehicle;

    // Vehicle reference refers to a Car object
    vehicle = new Car("CAR101", "Toyota", 180, 4);
    vehicle.displayDetails();

    // Vehicle reference now refers to a Bike object
    vehicle = new Bike("BIKE202", "Yamaha", 120, true);
    vehicle.displayDetails();
  }
}