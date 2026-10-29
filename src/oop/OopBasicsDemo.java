package oop;

/**
 * Module 06: classes, objects, encapsulation, constructors, and static members.
 *
 * Run: ./scripts/run.sh oop.OopBasicsDemo
 */
public class OopBasicsDemo {

    public static void main(String[] args) {
        Person person = new Person("Dara", 18, "Male");
        person.displayInfo();

        Computer computer = new Computer("Dell", "XPS 13", 2024, true);
        computer.display();

        Car car = new Car("Toyota", "Corolla", "White", 20_000);
        car.displayDetails();

        Moto moto = new Moto("Black", "Iron 883", "Harley-Davidson", 2022, 12_000);
        moto.displayInfo();
        moto.accelerate(80);

        Book book = new Book("Java Language", 10.00, "1000");
        book.displayDetails();

        Product keyboard = new Product(10, "Keyboard");
        Product mouse = new Product(11, "Mouse", 25.0);
        keyboard.displayProduct();
        mouse.displayProduct();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();

        BankAccount account = new BankAccount("ABC20126", "Chorn Thoen", 1000.0);
        account.displayBalance();
        System.out.println("Deposit $500: " + account.deposit(500));
        System.out.println("Withdraw $2000: " + account.withdraw(2000));
        System.out.println("Withdraw $200: " + account.withdraw(200));
        account.displayBalance();

        Student first = new Student(1, "Dara", 'A');
        Student second = new Student(2, "Sok", 'B');
        Student third = new Student(3, "Bora", 'F');
        first.displayInfo();
        second.displayInfo();
        third.displayInfo();
        System.out.println("Dara passing: " + first.isPassing());
        System.out.println("Bora passing: " + third.isPassing());
        Student.displayTotalStudents();
    }
}
