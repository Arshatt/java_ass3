package com.company;

public class Main {

    public static void main(String[] args) {

	Manufacturer manufacturer = new SalonDryCleaningDecorator(new SoundProofingDecorator(new PolishingDecorator(new FoilDecorator(new MercedesManufacturer())))) ;

    System.out.println(manufacturer.makeCar());
    }
}
