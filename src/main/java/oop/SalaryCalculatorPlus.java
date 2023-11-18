package oop;

import oop.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface
SalaryCalculatorPlus <T extends Employee> {
     double calculateTax(T employee);

     double calculateSalary(T employee);

    default Map<String, Double> calculateSalary(List<T> employees) {
        Map<String, Double> result = new HashMap<>();
        for (T employee : employees) {
            double salary = calculateTax(employee);
            result.put(employee.getNationalId(), salary);
        }
        return result;
    }
}
