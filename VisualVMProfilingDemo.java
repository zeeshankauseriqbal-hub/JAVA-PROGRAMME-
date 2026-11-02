package pack;
public class VisualVMProfilingDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            byte[] data = new byte[1_000_000];
            System.out.println("Created data block " + i);
            Thread.sleep(1000);
        }
        System.out.println("Profiling demo completed.");
    }
}
