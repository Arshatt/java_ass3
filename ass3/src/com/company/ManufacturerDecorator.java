package com.company;

public class ManufacturerDecorator implements Manufacturer {

    private Manufacturer manufacturer;

    public ManufacturerDecorator(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String makeCar() {
        return manufacturer.makeCar();
    }
}
