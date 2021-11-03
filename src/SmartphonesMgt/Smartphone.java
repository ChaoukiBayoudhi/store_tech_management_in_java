package SmartphonesMgt;

import Details.Microprocessor;
import Details.Provider;
import Details.Screen;
import Enumerations.ProductState;
import PrintersMgt.Printer;

public class Smartphone {
    private long id;
    private Microprocessor microprocessor;
    private Screen screen;
    private String battery;
    private Provider provider;
    private int RAM;
    private int hardDisk;
    private double price;
    private ProductState state;

    public Smartphone() {
    }

    public Smartphone(long id, Microprocessor microprocessor, Screen screen, String battery, Provider provider, int RAM, int hardDisk, double price, ProductState state) {
        this.id = id;
        this.microprocessor = microprocessor;
        this.screen = screen;
        this.battery = battery;
        this.provider = provider;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.price = price;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Microprocessor getMicroprocessor() {
        return microprocessor;
    }

    public void setMicroprocessor(Microprocessor microprocessor) {
        this.microprocessor = microprocessor;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }
    public void show()
    {
        System.out.println("Printer[ "+
                "id = "+this.id+
                "provider = "+this.provider.getName()+
                "price = "+this.price+
                "state = "+this.state+
                //...
                "]"
        );
    }
    public int compare(Smartphone p)
    {

        //compare this and the printer "p"
        return 0;
    }
}
