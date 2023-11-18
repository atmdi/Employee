package oop.model;

public abstract class  Employee {
    private String nationalId;
    private String name;
    private double salary;
    private double taxRate;

    protected Employee(String nationalId, String name, double salary, double taxRate) {
        this.nationalId = nationalId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public Employee() {
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
