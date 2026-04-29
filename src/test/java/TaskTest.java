import Task4.Transaction;
import Task4.TransactionStats;
import org.example.Task3.Employee;
import org.example.Task3.Task3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static Task4.Task4.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    private static final double DELTA = 0.01;
    @Test
    void testGroupingByDepartament(){
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

    @Test
    void testCalculator(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("t1", 1000, "SUCCESS"),
                new Transaction("t2", 2500, "FAILED"),
                new Transaction("t3", 4000, "SUCCESS"),
                new Transaction("t4", 1500, "SUCCESS")
        );

        TransactionStats result = calculator(transactions);
        assertEquals(3,result.getCount());
        assertEquals(6500,result.getSum());
        assertEquals(2166.67,result.getAvg(),DELTA);
        assertEquals(4000,result.getMax());
    }
}
