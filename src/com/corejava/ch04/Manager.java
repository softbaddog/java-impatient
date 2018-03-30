package com.corejava.ch04;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name) {
        super(name);
        this.bonus = 0;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + getName() +
                ",salary=" + getSalary() +
                ",bonus=" + bonus +
                '}';
    }
}
