package polymorphism;

/**
 * Main class to demonstrate all types of Polymorphism in Java
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("POLYMORPHISM IN JAVA - COMPLETE DEMO");
        System.out.println("========================================\n");

        // ===== 1. COMPILE-TIME POLYMORPHISM (Method Overloading) =====
        System.out.println("1. COMPILE-TIME POLYMORPHISM (Method Overloading)");
        System.out.println("--------------------------------------------------");
        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 10));
        System.out.println("Result: " + calc.add(5, 10, 15));
        System.out.println("Result: " + calc.add(5.5, 10.5));
        System.out.println("Result: " + calc.add("Hello", "World"));
        System.out.println("Result: " + calc.multiply(3, 4));
        System.out.println("Result: " + calc.multiply(2.5, 3.5));
        System.out.println();

        // ===== 2. RUNTIME POLYMORPHISM (Method Overriding with Abstract Class) =====
        System.out.println("2. RUNTIME POLYMORPHISM (Method Overriding)");
        System.out.println("--------------------------------------------------");

        // Parent reference, child objects - THIS IS POLYMORPHISM!
        Shape shape1 = new Circle("Red", 5.0);
        Shape shape2 = new Rectangle("Blue", 4.0, 6.0);
        Shape shape3 = new Triangle("Green", 3.0, 4.0, 3.0, 4.0, 5.0);

        // Array of Shape references - can hold any Shape subclass
        Shape[] shapes = { shape1, shape2, shape3 };

        // Polymorphic behavior - same method call, different implementations
        for (Shape shape : shapes) {
            shape.displayInfo();
        }

        // ===== 3. INTERFACE-BASED POLYMORPHISM =====
        System.out.println("3. INTERFACE-BASED POLYMORPHISM");
        System.out.println("--------------------------------------------------");

        // Interface reference, implementation objects - POLYMORPHISM!
        Animal animal1 = new Dog("Buddy", "Golden Retriever");
        Animal animal2 = new Cat("Whiskers", "Orange");
        Animal animal3 = new Bird("Tweety", true);

        // Array of Animal references - can hold any Animal implementation
        Animal[] animals = { animal1, animal2, animal3 };

        // Polymorphic behavior through interface
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
            animal.breathe(); // Default method from interface
            System.out.println();
        }

        // ===== 4. DEMONSTRATING DYNAMIC METHOD DISPATCH =====
        System.out.println("4. DYNAMIC METHOD DISPATCH");
        System.out.println("--------------------------------------------------");
        System.out.println("The JVM decides at RUNTIME which method to call");
        System.out.println("based on the actual object type, not the reference type.\n");

        Shape myShape;

        myShape = new Circle("Yellow", 3.0);
        System.out.println("myShape is now a Circle:");
        System.out.println("Area: " + myShape.calculateArea());

        myShape = new Rectangle("Purple", 5.0, 8.0);
        System.out.println("\nmyShape is now a Rectangle:");
        System.out.println("Area: " + myShape.calculateArea());

        myShape = new Triangle("Orange", 6.0, 4.0, 5.0, 5.0, 6.0);
        System.out.println("\nmyShape is now a Triangle:");
        System.out.println("Area: " + myShape.calculateArea());

        System.out.println("\n========================================");
        System.out.println("KEY BENEFITS OF POLYMORPHISM:");
        System.out.println("========================================");
        System.out.println("1. Code Reusability - Write once, use many times");
        System.out.println("2. Flexibility - Easy to add new types");
        System.out.println("3. Maintainability - Changes in one place");
        System.out.println("4. Extensibility - Easy to extend functionality");
        System.out.println("========================================");
    }
}
