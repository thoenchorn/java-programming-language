package oop;

/**
 * A student with a static counter shared by every instance.
 */
public class Student {
    private final int studentId;
    private String name;
    private char grade;

    private static int totalStudents = 0;
    public static final char PASSING_GRADE = 'E';

    public Student(int studentId, String name, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayInfo() {
        System.out.println("ID: " + studentId + " | Name: " + name + " | Grade: " + grade);
    }

    public boolean isPassing() {
        return grade <= PASSING_GRADE;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
