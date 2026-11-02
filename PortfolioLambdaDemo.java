package pack;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PortfolioLambdaDemo
{
    public static void main(String[] args)
    {
        List<Double> prices = Arrays.asList(100.0, 250.0, 80.0, 400.0 );
        Predicate<Double> expensive = price -> price >= 200;
        System.out.println("Expensive Portfolio Prices:");
        prices.stream()
                .filter(expensive)
                .forEach(price ->
                        System.out.println("Price: " + price)
                );
    }
}
