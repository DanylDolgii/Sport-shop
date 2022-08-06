package builder.entities.tshirts;

import builder.abstract_classes.T_shirt;

public class TshirtRed extends T_shirt {

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public float price() {
        return 279.49f;
    }

}
