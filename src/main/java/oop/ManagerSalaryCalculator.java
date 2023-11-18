package oop;

import oop.model.Employee;

public class ManagerSalaryCalculator implements SalaryCalculatorPlus {
    @Override
    public double calculateTax(Employee employee) {
        return employee.getSalary() * employee.getTaxRate() / 100;
    }

    @Override
    public double calculateSalary(Employee employee) {
        double taxAmount = calculateTax(employee);
        return employee.getSalary() - taxAmount +400000;
    }
}
