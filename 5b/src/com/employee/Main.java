package com.employee;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Employee("Cherry", "Manager");
        Employee developer = new Employee("Binty", "Developer");

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(manager.getName() + "'s Salary: $" + salaryCalculator.calculateSalary(manager));
        System.out.println(developer.getName() + "'s Salary: $" + salaryCalculator.calculateSalary(developer));
    }
}

