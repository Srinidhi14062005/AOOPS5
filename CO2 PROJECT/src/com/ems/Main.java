package com.ems;
import java.util.*;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 101, "Engineering", 75000));
        employees.add(new Employee("Bob", 102, "Marketing", 55000));

        // Lambda for sorting employees by name
        employees.sort(Employee.EmployeeComparator.compareByName());

        // Lambda for filtering employees with salary > 60000
        Predicate<Employee> highSalaryFilter = e -> e.getSalary() > 60000;
        employees.stream().filter(highSalaryFilter).forEach(e -> 
            System.out.println(e.getName() + ": $" + e.getSalary()));

        // Use of Inner Class
        Employee.Benefits aliceBenefits = employees.get(0).new Benefits("Gold Plan");
        aliceBenefits.showBenefits();
    }
}
