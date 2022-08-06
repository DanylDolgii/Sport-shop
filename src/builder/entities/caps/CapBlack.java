package builder.entities.caps;

import builder.abstract_classes.Cap;

public class CapBlack extends Cap {

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public float price() {
        return 166.99f;
    }
}
