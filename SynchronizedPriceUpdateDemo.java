package pack;
import java.util.concurrent.*;
class Price {
    private int value = 100;
    synchronized void update(int amount) {
        value += amount;
        System.out.println(Thread.currentThread().getName()
        + " price = " + value);
    }
    synchronized int get() {
        return value;
    }
}
public class SynchronizedPriceUpdateDemo {
    public static void main(String[] args) throws Exception {
        Price p = new Price();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int amount = 10;
            pool.submit(() -> p.update(amount));
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Final price: " + p.get());
    }
}
