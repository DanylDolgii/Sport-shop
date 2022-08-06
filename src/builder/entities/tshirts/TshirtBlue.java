package builder.entities.tshirts;

import builder.abstract_classes.T_shirt;

public class TshirtBlue extends T_shirt {

    @Override
    public String color() {
        return "Blue";
    }

    @Override
    public float price() {
        return 235.99f;
    }
}
