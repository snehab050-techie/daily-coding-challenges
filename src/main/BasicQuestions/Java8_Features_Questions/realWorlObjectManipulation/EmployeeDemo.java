package src.main.BasicQuestions.Java8_Features_Questions.realWorlObjectManipulation;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemo {
    static void main() {

        // 1. Create a dummy list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 26, 500, "IT"),
                new Employee("Priya", 30, 850, "HR"),
                new Employee("Rahul", 24, 450, "IT"),
                new Employee("Sneha", 28, 900, "Finance"),
                new Employee("Vikram", 35, 750, "HR"),
                new Employee("Anjali", 32, 570, "Finance")
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

        //Q2. Find the highest-paid employee in each department
        System.out.println("--- Highest-paid employee in each department ----");
        Map<String, Optional<Employee>> highestPaidEmpByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        highestPaidEmpByDept.forEach((dept, optEmp) ->
                System.out.println(dept+" -> "+optEmp.orElse(null))
        );

        //Q3. Sort the list of employees by their salary in descending order
        List<Employee> sortedEmp = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        sortedEmp.forEach(System.out::println);

        // Q4. Highest Paid employee in entire company
        System.out.println("----- Highest paid emp--------");
         Employee emp = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst()
                 .orElse(null);

        System.out.println(emp);

        //Q5. Find the top three highest-paid employees
        System.out.println("---------------");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList()
                .subList(0,3)
                .forEach(e -> System.out.println(e.getName()+" - "+e.getSalary()));

        //Q6. Find the average salary of all employees in each department
        System.out.println("-----------------------");
        Map<String, Double> res = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        res.forEach((dept, avgSalary) ->
                System.out.println(dept+" : "+avgSalary)
        );
    }
}
