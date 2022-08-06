package builder.entities.firms;

import builder.interfaces.Manufacturer;

public class TshirtFirm implements Manufacturer {

    @Override
    public String firm() {
        return "Active sports";
    }
}
