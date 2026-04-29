import org.example.Task3.Employee;
import org.example.Task3.Task3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    void groupingByDepartament(){
        List<Employee> employees = Arrays.asList(
                new Employee ("Ivan", "IT", 150000),
                new Employee ("Anna", "HR", 90000),
                new Employee ("Petr", "IT", 170000),
                new Employee("Olga", "Finance", 130000),
                new Employee("Maria", "HR", 95000)
        );

        Map<String,List<String>> result = Task3.groupingByDepartament(employees);

        assertEquals(Arrays.asList("Ivan", "Petr"), result.get("IT"));
        assertEquals(Arrays.asList("Anna", "Maria"), result.get("HR"));
        assertEquals(List.of("Olga"), result.get("Finance"));
    }
}
