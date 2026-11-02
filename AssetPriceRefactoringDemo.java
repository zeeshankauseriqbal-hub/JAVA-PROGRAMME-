package pack;
class Asset1 {
    String name;
    double price;
    Asset1(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class PriceService {
    double applyIncrease(Asset1 a, double percent) {
        return a.price + a.price * percent / 100;
    }
}
class AssetPrinter {
    void print(String name, double price) {
        System.out.println(name + " updated price: " + price);
    }
}
public class AssetPriceRefactoringDemo {
    public static void main(String[] args) {
        Asset1 a = new Asset1("ABC", 100);
        PriceService service = new PriceService();
        AssetPrinter printer = new AssetPrinter();
        printer.print(a.name, service.applyIncrease(a, 10));
    }
}
