package pack;
import java.util.logging.Logger;
public class PortfolioLoggingDemo {
    private static final Logger log = Logger.getLogger(PortfolioLoggingDemo.class.getName());
    public static void main(String[] args) {
        log.info("Portfolio application started");
        String asset = "ABC";
        double price = 100.0;
        log.info("PRICE_UPDATE asset=" + asset + " price=" + price);
        log.warning("DEMO_WARNING sample warning message");
        log.info("Portfolio application finished");
    }
}
