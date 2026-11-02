package pack;
import java.util.concurrent.*;
public class AsyncPriceEngineDemo {
    static int fetch(String stock) {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Fetched " + stock);
        return 100 + stock.length();
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int a = fetch("ABC");
        int b = fetch("XYZ");
        int c = fetch("PQR");
        System.out.println("Sequential total: " + (a + b + c));
        System.out.println("Sequential ms: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> fetch("ABC"));
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> fetch("XYZ"));
        CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() -> fetch("PQR"));
        int total = f1.join() + f2.join() + f3.join();
        System.out.println("Concurrent total: " + total);
        System.out.println("Concurrent ms: " + (System.currentTimeMillis() - start));
    }
}
