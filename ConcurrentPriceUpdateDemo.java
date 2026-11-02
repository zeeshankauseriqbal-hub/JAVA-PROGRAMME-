package pack;
import java.util.concurrent.*;
class ConcurrentPriceUpdateDemo {
    static void update(String name, int price) {
        System.out.println(Thread.currentThread().getName()
        + " updated " + name + " to " + price);
    }
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> update("ABC", 110));
        Runnable task = () -> update("XYZ", 120);
        Thread t2 = new Thread(task);
        Callable<String> call = () -> {
            update("PQR", 130);
            return "Callable finished";
        };
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> result = ex.submit(call);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(result.get());
        ex.shutdown();
    }
}