package pack;
import java.util.*;
public class PortfolioCollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> assets = new ArrayList<>();
        assets.add("ABC");
        assets.add("XYZ");
        assets.add("ABC");
        HashSet<String> unique = new HashSet<>(assets);
        LinkedHashSet<String> ordered = new LinkedHashSet<>(assets);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "ABC");
        map.put(102, "XYZ");
        System.out.println("List: " + assets);
        System.out.println("Unique: " + unique);
        System.out.println("Ordered unique: " + ordered);
        System.out.println("Search ID 101: " + map.get(101));
        map.put(102, "XYZ Updated");
        map.remove(101);
        System.out.println("After update/delete: " + map);
    }
}
