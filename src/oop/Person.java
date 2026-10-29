package oop;

/**
 * Demonstrates constructors, encapsulation, and instance methods.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this("Unknown", 0, "Unknown");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age + " | Gender: " + gender);
    }
}
