package ComputersMgt;

//import Details.Microprocessor;
//import Details.Provider;
//import Details.Screen;
//or
import Details.*;
import Enumerations.ProductState;

public class Computer {
    private long id;
    //composition
    private Microprocessor microprocess;
    private Screen screen;
    private Provider provider;
    private String Battery;
    private double price;
    private int RAM;
    private int hardDisk;
    private ProductState state;
    //constructors
    public Computer()
    {
        this.id=1;
        this.provider=new Provider();
        this.microprocess=new Microprocessor();
        this.screen=new Screen();
        this.Battery="";
        this.price=0.0;
        this.RAM=0;
        this.hardDisk=0;
        this.state=ProductState.AVAILABLE;
    }

    public Computer(long id, Microprocessor microprocess, Screen screen, Provider provider, String battery, double price, int RAM, int hardDisk, ProductState state) {
        this.id = id;
        this.microprocess = microprocess;
        this.screen = screen;
        this.provider = provider;
        Battery = battery;
        this.price = price;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Microprocessor getMicroprocess() {
        return microprocess;
    }

    public void setMicroprocess(Microprocessor microprocess) {
        this.microprocess = microprocess;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }
}