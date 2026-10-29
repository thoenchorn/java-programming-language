package abstraction;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("The " + getBrand() + " " + getModel() + " starts with a push button.");
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle is accelerating by twisting the handle grip.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Has Sidecar: " + hasSidecar);
    }
}
