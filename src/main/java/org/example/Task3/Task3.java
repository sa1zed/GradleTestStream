package org.example.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee ("Ivan", "IT", 150000),
                new Employee ("Anna", "HR", 90000),
                new Employee ("Petr", "IT", 170000),
                new Employee("Olga", "Finance", 130000),
                new Employee("Maria", "HR", 95000)
        );

        Map<String,List<String>> result = groupingByDepartament(employees);
        System.out.println(result);
    }

    public static Map<String, List<String>> groupingByDepartament(List<Employee> employees){
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament,
                        Collectors.mapping(Employee::getName,Collectors.toList())));
    }
}
