package pack;
import java.util.*;
class Asset implements Comparable<Asset> {
    String name;
    double price;
    Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public int compareTo(Asset other) {
        return Double.compare(price, other.price);
    }
    public String toString() {
        return name + " " + price;
    }
}
class Repository<T> {
    private List<T> items = new ArrayList<>();
    void add(T item) {
        items.add(item);
    }
    List<T> getAll() {
        return items;
    }
}

public class AssetSortingDemo {
    public static void main(String[] args) {
        Repository<Asset> repo = new Repository<>();
        repo.add(new Asset("ABC", 120));
        repo.add(new Asset("XYZ", 80));
        repo.add(new Asset("PQR", 150));
        List<Asset> list = repo.getAll();
        Collections.sort(list);
        System.out.println("Price ascending: " + list);
        list.sort(Comparator.comparing(a -> a.name));
        System.out.println("Name ascending: " + list);
    }
}
