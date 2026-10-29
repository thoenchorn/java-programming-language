package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Vehicle myVehicle = new Vehicle("Generic", "Brand"); // Error: Cannot
        // instantiate abstract class

        var myCar = new Car("Toyota", "Camry", 4);
        var myBike = new Motorcycle("Harley-Davidson", "Iron 883", false);

        System.out.println("--- Testing Car ---");
        myCar.displayInfo();
        myCar.startEngine();
        myCar.accelerate();

        System.out.println("\n--- Testing Motorcycle ---");
        myBike.displayInfo();
        myBike.startEngine();
        myBike.accelerate();
    }
}
