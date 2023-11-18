package oop;


import oop.model.Employee;
import oop.model.Manager;
import oop.model.Secretary;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        List<Employee> employeeList=new ArrayList<>();




        Manager managerCalculator = new Manager();

        Employee manager1 = new Manager();
        manager1.setName("dara nikooo");
        manager1.setNationalId("001");
        manager1.setSalary(9000000000D);
        manager1.setTaxRate(0.2D);

        System.out.println(manager1.getName()+"is salary: "+salaryCalculator.calculateSalary(manager1));

        Manager manager2 = new Manager();
        manager2.setName("ali jalal");
        manager2.setNationalId("0021");
        manager2.setSalary(7000000D);
        manager2.setTaxRate(0.2D);

        System.out.println(manager2.getName()+"is salary: "+salaryCalculator.calculateSalary(manager2));

        Secretary secretary1=new Secretary();
        secretary1.setNationalId("0065");
        secretary1.setName("shiva mahan");
        secretary1.setSalary(10000000D);
        secretary1.setTaxRate(0.15D);

        System.out.println(secretary1.getName()+" is salary:"+salaryCalculator.calculateSalary(secretary1));


        Secretary secretary2=new Secretary();
        secretary2.setNationalId("005");
        secretary2.setName("shima rad");
        secretary2.setSalary(10000000D);
        secretary2.setTaxRate(0.15D);

        System.out.println(secretary2.getName()+" is salary:"+salaryCalculator.calculateSalary(secretary2));

        employeeList.addAll(Arrays.asList(secretary1,secretary2,manager1,manager2));
        System.out.println("list is:"+salaryCalculator.calculateSalary(employeeList));

        ManagerSalaryCalculator managerSalaryCalculator=new ManagerSalaryCalculator();
        System.out.println("salary manager is:"+managerSalaryCalculator.calculateSalary(manager2));


    }
}



