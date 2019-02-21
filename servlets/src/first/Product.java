package first;

public class Product {
    public String name;
    public int productID;
    public String desc;

    public Product(String name, int productID, String desc) {
        this.name = name;
        this.productID = productID;
        this.desc = desc;
    }
    public Product(){

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
