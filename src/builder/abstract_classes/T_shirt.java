package builder.abstract_classes;

import builder.entities.firms.TshirtFirm;
import builder.interfaces.Item;
import builder.interfaces.Manufacturer;

public abstract class T_shirt implements Item {

    @Override
    public String name() {
        return "T-shirt";
    }

    @Override
    public Manufacturer firm() {
        return new TshirtFirm();
    }
}
