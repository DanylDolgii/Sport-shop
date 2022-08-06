package builder;

import builder.model_order.Order;
import builder.model_order.OrderBuilder;

public class Builder {

    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.orderA();
        System.out.println("Order A \n");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());

        Order orderB = orderBuilder.orderB();
        System.out.println("\nOrder B \n");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getCost());
    }
}
