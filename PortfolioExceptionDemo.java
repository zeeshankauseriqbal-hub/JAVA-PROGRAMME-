package pack;
class InvalidTradeException extends Exception {
    InvalidTradeException(String message) {
        super(message);
    }
}
class Portfolio {
    int holdings = 5;
    void sell(int quantity) throws InvalidTradeException {
        if (quantity <= 0) {
            throw new InvalidTradeException("Quantity must be positive.");
        }
        if (quantity > holdings) {
            throw new InvalidTradeException("Insufficient holdings.");
        }
        holdings -= quantity;
        System.out.println("Sale successful. Remaining: " + holdings);
    }
}
public class PortfolioExceptionDemo {
    public static void main(String[] args) {
        Portfolio p = new Portfolio();
        try {
            p.sell(7);
        }
        catch (InvalidTradeException e) {
            System.out.println("Trade error: " + e.getMessage());
        }
    }
}
