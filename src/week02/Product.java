package week02;

public class Product {
    private String name;
    private int price;
    private double weight;

    Product (String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight =weight;
    }
    int getPrice() {
        return this.price;
    }

    Double getWeight() {
        return this.weight;
    }
}
