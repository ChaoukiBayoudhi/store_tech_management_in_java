package Details;

import Enumerations.MicroprocessorBrand;

public class Microprocessor {
    private MicroprocessorBrand brand;
    private float speed;
    private int nbrCore;

    public Microprocessor() {
    }

    public Microprocessor(MicroprocessorBrand brand, float speed, int nbrCore) {
        this.brand = brand;
        this.speed = speed;
        this.nbrCore = nbrCore;
    }

    public MicroprocessorBrand getBrand() {
        return brand;
    }

    public void setBrand(MicroprocessorBrand brand) {
        this.brand = brand;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getNbrCore() {
        return nbrCore;
    }

    public void setNbrCore(int nbrCore) {
        this.nbrCore = nbrCore;
    }
}
