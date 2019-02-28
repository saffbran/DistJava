package distributedJava.model;

public class Product {
    private String name;
    private int productID;
    private String desc;
    private int price;

    public Product(String name, int productID, String desc) {
        this.name = name;
        this.productID = productID;
        this.desc = desc;
        this.price = price;
    }
    public Product(){

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productID;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
