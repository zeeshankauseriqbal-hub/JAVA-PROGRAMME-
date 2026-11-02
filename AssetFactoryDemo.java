package pack;
interface Asset {
    void show();
}
class Stock implements Asset {
    public void show() {
        System.out.println("Stock asset");
    }
}
class Bond implements Asset {
    public void show() {
        System.out.println("Bond asset");
    }
}
class AssetFactory {
    static Asset create(String type) {
        if (type.equalsIgnoreCase("stock")) {
            return new Stock();
        }
        if (type.equalsIgnoreCase("bond")) {
            return new Bond();
        }
        throw new IllegalArgumentException("Unknown asset type");
    }
}

public class AssetFactoryDemo {
    public static void main(String[] args) {
        Asset a = AssetFactory.create("stock");
        Asset b = AssetFactory.create("bond");
        a.show();
        b.show();
    }
}
