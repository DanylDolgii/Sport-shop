package builder.entities.caps;

import builder.abstract_classes.Cap;

public class CapWhite extends Cap {

    @Override
    public String color() {
        return "White";
    }

    @Override
    public float price() {
        return 182.00f;
    }
}
