package chapter9.model.model;

import chapter9.model.model.ClothingItem;
import chapter9.model.model.ClothingSize;

// the extends ClothingItem, allows the class Hat to inherit methods and attributes from ClothingItem
public class Hat extends ClothingItem {
    // Shirt subclass has access to all data except the private fields of ClothingItem

    //must build a constructor
    //Go to Code -> generate -> constructor, to automatically make this
    public Hat(ClothingSize size, double price, int quantity) {

        super(ClothingItem.HAT, size, price, quantity);
    }
}
