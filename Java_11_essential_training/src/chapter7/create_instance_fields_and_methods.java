package chapter7;

import chapter7.model.clothingItem;
import chapter7.model.clothingSize;

import java.text.NumberFormat;

public class create_instance_fields_and_methods {
    public static void main(String[] args) {
        // here are the input for the code
        var item = new clothingItem(clothingItem.SHIRT,
                clothingSize.L,
                19.99,
                3);
//        item.setType("shirt");
//        item.setSize("M");
//        item.setPrice(19.99);
//        item.setQuantity(3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order of size %s will cost %s",
                item.getType(),
                item.getSize(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
