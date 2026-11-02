package pack;
import java.io.*;
public class PortfolioFileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Create and write data
            FileWriter w = new FileWriter("portfolio.txt");
            w.write("101, ABC, 1000");
            w.close();
            System.out.println("Data saved.");
            // Read data
            BufferedReader r = new BufferedReader(new FileReader("portfolio.txt"));
            String data = r.readLine();
            r.close();
            System.out.println("Read: " + data);
            // Update data
            FileWriter w2 = new FileWriter("portfolio.txt");
            w2.write("101, ABC, 1200");
            w2.close();
            System.out.println("Data updated.");
        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}
