package builder.model_order;

import builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Color: " + item.color());
            System.out.print(", Firm: " + item.firm().firm());
            System.out.println(", Price: " + item.price());
        }
    }
}
