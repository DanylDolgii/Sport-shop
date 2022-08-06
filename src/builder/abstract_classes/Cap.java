package builder.abstract_classes;

import builder.entities.firms.CapFirm;
import builder.interfaces.Item;
import builder.interfaces.Manufacturer;

public abstract class Cap implements Item {

    @Override
    public String name() {
        return "Cap";
    }

    @Override
    public Manufacturer firm() {
        return new CapFirm();
    }
}
