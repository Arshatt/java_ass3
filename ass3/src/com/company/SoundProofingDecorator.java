package com.company;

public class SoundProofingDecorator extends ManufacturerDecorator {

    public SoundProofingDecorator(Manufacturer manufacturer) {
        super(manufacturer);
    }

    public String putSoundIsolation(){
        return "Isolating inside of the car from noise. "+"\n";
    }

    @Override
    public String makeCar() {
        return super.makeCar()+ putSoundIsolation();
    }
}
