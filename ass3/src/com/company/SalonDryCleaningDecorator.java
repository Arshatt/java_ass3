package com.company;

public class SalonDryCleaningDecorator extends ManufacturerDecorator{

    public SalonDryCleaningDecorator(Manufacturer manufacturer) {
        super(manufacturer);
    }

    public String makeCleaningOfSalon(){
        return "Cleaning the car with chemicals. "+"\n";
    }

    @Override
    public String makeCar() {
        return super.makeCar()+makeCleaningOfSalon();
    }
}
