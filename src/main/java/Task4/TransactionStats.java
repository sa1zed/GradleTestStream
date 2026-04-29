package Task4;

public class TransactionStats {
    long count;
    long sum;
    double avg;
    int max;

    public TransactionStats(long count, long sum, double avg, int max) {
        this.count = count;
        this.avg = avg;
        this.sum = sum;
        this.max = max;
    }



    public long getCount() {
        return count;
    }

    public double getAvg() {
        return avg;
    }

    public long getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return String.format("count=%d, " +
                "sum=%d, " +
                "avg=%.2f "+
                "max=%d",count,
                sum,
                avg,
                max);
    }
}
