package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String color;
    private String describes;
    private String category;

    public Product(){}

    public Product(int id, String name, int price, int quantity, String color, String describes, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describes = describes;
        this.category = category;
    }

    public Product(String name, int price, int quantity, String color, String describes, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describes = describes;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category_id) {
        this.category = category;
    }
}
