package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Module 10: declarative data processing with the Stream API.
 */
public class StreamDemo {

    record Employee(String name, String department, int salary) {
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Dara", "Engineering", 1200),
                new Employee("Sok", "Engineering", 1500),
                new Employee("Bora", "Sales", 900),
                new Employee("Maly", "Sales", 1100));

        List<String> highEarners = employees.stream()
                .filter(employee -> employee.salary() >= 1100)
                .map(Employee::name)
                .toList();
        System.out.println("Earn at least 1100: " + highEarners);

        int totalSalary = employees.stream()
                .mapToInt(Employee::salary)
                .sum();
        System.out.println("Total salary: " + totalSalary);

        Map<String, List<String>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.mapping(Employee::name, Collectors.toList())));
        System.out.println("By department: " + byDepartment);

        System.out.println("Even numbers 1-10: "
                + IntStream.rangeClosed(1, 10)
                        .filter(number -> number % 2 == 0)
                        .boxed()
                        .toList());
    }
}
