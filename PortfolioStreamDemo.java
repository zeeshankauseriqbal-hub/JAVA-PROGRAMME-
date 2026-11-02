package pack;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class PortfolioStreamDemo
{
    public static void main(String[] args)
    {
        List<Double> prices = Arrays.asList(100.0,250.0,80.0,400.0);
        System.out.println("Prices above 150:");
        prices.stream()
                .filter(price -> price > 150)
                .forEach(price ->System.out.println(price)  );
        double total = prices.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        double average = prices.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        Optional<Double> found = prices.stream()
                .filter(price -> price == 250.0)
                .findFirst();
        System.out.println("Found: " + found.orElse(-1.0));
    }
}
