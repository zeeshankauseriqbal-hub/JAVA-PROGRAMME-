package pack;
public class RuntimeMemoryThreadDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Maximum memory: " + r.maxMemory() / (1024 * 1024) + " MB");
        System.out.println("Total memory: " + r.totalMemory() / (1024 * 1024) + " MB");
        System.out.println("Free memory: " + r.freeMemory() / (1024 * 1024) + " MB");
        System.out.println("Active threads: " + Thread.activeCount());
        for (Thread t: Thread.getAllStackTraces().keySet()) {
            System.out.println("Thread: " + t.getName());
        }
    }
}
