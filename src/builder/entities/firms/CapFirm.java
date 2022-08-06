package builder.entities.firms;

import builder.interfaces.Manufacturer;

public class CapFirm implements Manufacturer {

    @Override
    public String firm() {
        return "Smart caps";
    }
}
