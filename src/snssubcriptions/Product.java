package snssubcriptions;

// Class to handle products
public class Product {
    private final String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product with name: " + name +
                "\nprice: $" + price +"\n";
    }
}
