package io.priyank.springbootut.model;

public class Item {

    private int id;
    private String name;
    private int price;
    private int quantity;

    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public void setQuantity(int quanity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Item[%d, %s, %d, %d]", this.id, this.name, this.price, this.quantity);
    }
}
