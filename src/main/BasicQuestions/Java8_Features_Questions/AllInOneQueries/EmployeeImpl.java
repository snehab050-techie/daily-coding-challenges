package src.main.BasicQuestions.Java8_Features_Questions.AllInOneQueries;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImpl {
    static void main(String[] args) {

        List<EmployeeDetails> employeeDetailsList = Arrays.asList(
                new EmployeeDetails(101, "Sneha", 89000, "IT"),
                new EmployeeDetails(102, "Suhas", 95000, "Finance"),
                new EmployeeDetails(103, "Janu", 69000, "Marketing"),
                new EmployeeDetails(104, "Arun", 56000, "HR"),
                new EmployeeDetails(105, "Rahul", 49000, "IT"),
                new EmployeeDetails(106, "Alis", 23000, "Finance"),
                new EmployeeDetails(107, "Mark", 68000, "IT"),
                new EmployeeDetails(108, "Steve", 97000, "HR")
        );

//        System.out.println(employeeDetailsList);

        // 1) Find the highest-paid employee
        EmployeeDetails highSalaryEmployee = employeeDetailsList.stream()
                .sorted(Comparator.comparingInt(EmployeeDetails::getSalary).reversed())
                .findFirst()
                .orElseThrow();

        System.out.println(highSalaryEmployee);

        // 2) Find the second-highest-paid employee

        EmployeeDetails secHighPaidEmp = employeeDetailsList.stream()
                .sorted(Comparator.comparingInt(EmployeeDetails::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secHighPaidEmp);

        System.out.println("--------------------");
        // 3) Find the top 3 highest-paid employees
        employeeDetailsList.stream()
                .sorted(Comparator.comparingInt(EmployeeDetails::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------------");
        // 4) Group employees by department
        Map<String, List<EmployeeDetails>> eempByDept = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName));

        eempByDept.forEach((dept, empList) ->
                {
                    System.out.println(dept + " - ");
                    empList.forEach(e -> System.out.println(e.getName()));
                }
        );

        //5) Count employees in each department
        Map<String, Long> empCountDeptWise = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName, Collectors.counting()));

        empCountDeptWise.forEach((dept, count) -> System.out.println(dept + " - " + count));

        // 6) Find the highest-paid employee in each department
        System.out.println("------------");
        Map<String, Optional<EmployeeDetails>> highPaidEmpDeptWise = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName, Collectors.maxBy(Comparator.comparingInt(EmployeeDetails::getSalary))));

        highPaidEmpDeptWise.forEach((dept, empList) ->
        {
            System.out.println(dept + " - ");
            System.out.println(empList);
        });

        // 7) Find the average salary of employees in entire company
        System.out.println("------------entire avg sal");
        Double avgSal = employeeDetailsList.stream()
                .collect(Collectors.averagingDouble(EmployeeDetails::getSalary));

        System.out.println(avgSal);

        // Find the average salary of employees in each department
        System.out.println("--------avg sal dept wise");
        Map<String, Double> avgSalDeptWise = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName, Collectors.averagingDouble(EmployeeDetails::getSalary)));

        avgSalDeptWise.forEach((dept, asal) -> System.out.println(dept + " - " + asal));

        // 8) Find the total salary of each department
        System.out.println("---------total sal dept wise");
        employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName, Collectors.summingDouble(EmployeeDetails::getSalary)))
                .forEach((key, value) -> System.out.println(key + " - " + value));

        // 9) Find employees earning above the average salary

        System.out.println("-------------------");
        // above avg salary of entire company
        double avgSalary = employeeDetailsList
                .stream()
                .mapToDouble(EmployeeDetails::getSalary)
                .average()
                .orElse(0.0);

        System.out.println(avgSalary);

        List<EmployeeDetails> empSalAboveAvgSalComp = employeeDetailsList
                .stream()
                .filter(emp -> emp.getSalary() > avgSalary)
                .collect(Collectors.toList());

        empSalAboveAvgSalComp.forEach(System.out::println);

        //above avg salary of their own department

        System.out.println("--------------");
        Map<String, Double> deptAvgSal = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName, Collectors.averagingDouble(EmployeeDetails::getSalary)));

        System.out.println(deptAvgSal);
        List<EmployeeDetails> result = employeeDetailsList.stream()
                .filter(emp -> emp.getSalary() > deptAvgSal.get(emp.getDeptName()))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        // -- sort empoyees by salary
        System.out.println("---------------------sort emp by salary");

        //sorted in ASC
        List<EmployeeDetails> empList = employeeDetailsList.stream()
                .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary))
                .collect(Collectors.toList());

        empList.forEach(System.out::println);

        // sorted in DESC
        System.out.println("-----------in DESC order");
        List<EmployeeDetails> list = employeeDetailsList.stream()
                .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed())
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        // sort employees based on salary within their own department - ASC order
        System.out.println("----------------");
        Map<String, List<EmployeeDetails>> empDetailsList = employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lvalue -> lvalue.stream()
                                        .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary))
                                        .collect(Collectors.toList())
                        )));

        empDetailsList.forEach((key, value) -> System.out.println(key + " - " + value));

        // -- sorted employees based on salary within their own department - DESC order
        System.out.println("-------------------in desc order");
        employeeDetailsList.stream()
                .collect(Collectors.groupingBy(EmployeeDetails::getDeptName,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                listEle -> listEle.stream()
                                        .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed())
                        ))).forEach((dept, employeeList) ->
                {
                    System.out.println(dept + " - ");
                    employeeList.forEach(System.out::println);
                    System.out.println();
                });

        // Convert a List<Employee> into a Map<EmployeeId, Employee>
        System.out.println("------------ map every emp to id");
        Map<Integer, EmployeeDetails> mappedEmployeeToId = employeeDetailsList.stream()
                .collect(Collectors.toMap(EmployeeDetails::getId, employee -> employee));

        // OR
       /* Map<Integer, EmployeeDetails> employeeMap =
                employeeDetailsList.stream()
                        .collect(Collectors.toMap(
                                EmployeeDetails::getId,
                                Function.identity()
                        ));*/

        mappedEmployeeToId.forEach((id, emp) ->
        {
            System.out.println(id + " - ");
            System.out.println(emp);
            System.out.println();
        });
    }
}
