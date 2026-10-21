package src.main.BasicQuestions.Java8_Features_Questions.realWorlObjectManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
    static void main() {

        // 1. Create a dummy list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 26, 50000, "IT"),
                new Employee("Priya", 30, 85000, "HR"),
                new Employee("Rahul", 24, 45000, "IT"),
                new Employee("Sneha", 28, 90000, "Finance"),
                new Employee("Vikram", 35, 75000, "HR"),
                new Employee("Anjali", 32, 95000, "Finance")
        );

        System.out.println("---------------All Employees------------------");
        employees.forEach(System.out::println);

        // Q1. Group employees by their department
        System.out.println("---- Employees grouped by their department ----");
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDept.forEach(
                (dept, empList) ->
                {System.out.println("Department: "+dept);
                 empList.forEach(emp -> System.out.println(" "+emp.getName()));
                }
        );
    }
}
