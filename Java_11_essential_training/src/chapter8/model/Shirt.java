package chapter8.model;

public class Shirt extends ClothingItem {
    // Shirt subclass has access to all data except the private fields of ClothingItem

    //must build a constructor
    //Go to Code -> generate -> constructor, to automatically make this
    public Shirt(ClothingSize size, double price, int quantity) {
        super(ClothingItem.SHIRT, size, price, quantity);
    }
}
