package com.company;

public class PolishingDecorator extends ManufacturerDecorator {

    public PolishingDecorator(Manufacturer manufacturer) {
        super(manufacturer);
    }

    public String makePolishing(){
        return "Process of polishing the car. "+"\n";
    }

    @Override
    public String makeCar() {
        return super.makeCar()+ makePolishing();
    }
}
