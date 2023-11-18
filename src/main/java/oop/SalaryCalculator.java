package oop;

import oop.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class  SalaryCalculator <T extends Employee>{
        private double calculateTax(T employee) {
            return employee.getSalary() * employee.getTaxRate() / 100;
        }

        public double calculateSalary(T employee) {
            double taxAmount = calculateTax(employee);
            return employee.getSalary() - taxAmount;
        }

        public Map<String, Double> calculateSalary(List<T> employees) {
            Map<String, Double> result = new HashMap<>();
            for (T employee : employees) {
                double salary = calculateTax(employee);
                result.put(employee.getNationalId(), salary);
            }
            return result;
        }
    }
