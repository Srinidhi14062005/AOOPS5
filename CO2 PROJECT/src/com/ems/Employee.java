package com.ems;

import java.util.*;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Static Nested Class for Comparators
    public static class EmployeeComparator {
        public static Comparator<Employee> compareByName() {
            return (e1, e2) -> e1.getName().compareTo(e2.getName());
        }
        public static Comparator<Employee> compareBySalary() {
            return Comparator.comparingDouble(Employee::getSalary);
        }
    }

    // Inner Class for additional details
    class Benefits {
        private String healthPlan;
        public Benefits(String healthPlan) {
            this.healthPlan = healthPlan;
        }
        public void showBenefits() {
            System.out.println(name + " is eligible for " + healthPlan);
        }
    }
}

