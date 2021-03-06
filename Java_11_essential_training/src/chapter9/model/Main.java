package chapter9.model;

import chapter8.model.ClothingItem;
import chapter8.model.ClothingSize;
import chapter8.model.Hat;
import chapter8.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // creates an interfaces, a collection is resizable?
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<ClothingItem> items = new ArrayList<>();
        items.add(new Shirt(
                ClothingSize.L,
                19.99,
                3));
        items.add(new Hat(
                ClothingSize.M,
                29.99,
                1));


        for (ClothingItem item:items) {
            displayItemDetails(item);
        }

    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
