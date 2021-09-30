package com.company;

public class FoilDecorator extends ManufacturerDecorator {

    public FoilDecorator(Manufacturer manufacturer) {
        super(manufacturer);
    }

    String makeFoilWrapping() {
        return "Wrapping the car with foil. "+"\n";
    }

    @Override
    public String makeCar() {
        return super.makeCar() + makeFoilWrapping();
    }
}
