package Task4;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("t1", 1000, "SUCCESS"),
                new Transaction("t2", 2500, "FAILED"),
                new Transaction("t3", 4000, "SUCCESS"),
                new Transaction("t4", 1500, "SUCCESS")
        );

        TransactionStats result = calculator(transactions);
        System.out.println(result);
    }

    public static TransactionStats calculator(List<Transaction> transactions){
        IntSummaryStatistics stats = transactions.stream()
                .filter(transaction -> "SUCCESS".equals(transaction.status))
                .mapToInt(Transaction::getAmount)
                .summaryStatistics();

        return new TransactionStats(
                stats.getCount(),
                stats.getSum(),
                stats.getAverage(),
                stats.getMax()
                );

    }
}
