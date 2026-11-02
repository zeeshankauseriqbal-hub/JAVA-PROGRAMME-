package pack;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class ConcurrentPortfolioDataDemo {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Integer, String> prices = new ConcurrentHashMap<>();
        AtomicInteger count = new AtomicInteger(0);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            pool.submit(() -> {
                prices.put(id, "Stock-" + id);
                count.incrementAndGet();
            }
            );
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Stocks stored: " + prices.size());
        System.out.println("Tasks completed: " + count.get());
        System.out.println("Data: " + new java.util.TreeMap<>(prices));
    }
}