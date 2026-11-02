package com.portfolio.app;
import com.portfolio.model.Asset;
import com.portfolio.model.Stock;
import com.portfolio.model.Bond;
import com.portfolio.model.UserInfo;
public class PortfolioJava17FeaturesDemo {
    public static void main(String[] args) {
        var user = new UserInfo(101, "Rahul");
        var stock1 = new Stock("Equity", 100000);
        var stock2 = new Stock("Equity", 100000);
        var bond = new Bond("Government Bond", 50000);
        System.out.println("USER DETAILS");
        System.out.println(user);
        System.out.println("\nSTOCK DETAILS");
        stock1.display();
        System.out.println("\nBOND DETAILS");
        bond.display();
        System.out.println("\nOBJECT METHODS");
        System.out.println(stock1);
        System.out.println("\nEQUALITY TEST");
        System.out.println(stock1.equals(stock2));
        System.out.println("\nHASH CODES");
        System.out.println(stock1.hashCode());
        System.out.println(stock2.hashCode());
        Asset asset = stock1;
        System.out.println("\nPOLYMORPHISM");
        asset.display();
    }
}
