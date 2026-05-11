package org.example.Task3;

public class Employee {
    String name;
    String departament;
    int salary;

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }
}
