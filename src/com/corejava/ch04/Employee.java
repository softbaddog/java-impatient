package com.corejava.ch04;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
        this("None");
    }

    public Employee(String name) {
        this(name, 10000);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double raiseSalary(double raise) {
        return this.salary + raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
