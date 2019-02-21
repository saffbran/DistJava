package first;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static final Inventory INVENTORY = new Inventory();
    public static List<Product> productList;

    public Inventory() {
        productList = new ArrayList<Product>();
        productList.add(new Product("Roses",1, "Romantic style roses"));
        productList.add(new Product("Tulips",2, "An old classic"));
        productList.add(new Product("Daffodils", 3, "Perfect for children"));
    }

    public static List<Product> getProductList() {
        return productList;
    }
}
