package ComputersMgt;

//import Details.Microprocessor;
//import Details.Provider;
//import Details.Screen;
//or
import Details.*;
import Enumerations.ProductState;
import PrintersMgt.Printer;

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
    private double evaluateCoefficient()
    {
        double microprocess_perfm,screen_perfm,brand_perform;
        switch (this.getMicroprocess().getBrand())
        {
            case DRAGON :
                brand_perform=50;
                break;
            case INTEL:
                brand_perform=40;
                break;
            case AMD :
                brand_perform=30;
                break;
            case CELERON:
                brand_perform=20;
                break;
            default :
                brand_perform=10;
        }

        microprocess_perfm=0.6*microprocess.getSpeed()*microprocess.getNbrCore()+0.4*brand_perform;
        double type_perfm;
        switch (this.screen.getType())
        {
            case SUPERAMOLED :
                type_perfm=60;
                break;
            case AMOLED :
                type_perfm=50;
                break;
            case RETINA:
                type_perfm=40;
                break;
            case LED :
                type_perfm=30;
                break;
            case LCD:
                type_perfm=20;
                break;
                default:
                    type_perfm=10;
        }
        screen_perfm=0.3*screen.getSize()+0.7*type_perfm;
        double memory_capacity=0.6*RAM+0.4*hardDisk;
        return 40*microprocess_perfm+30*screen_perfm+30*memory_capacity;
    }
    public int compare(Computer c)
    {
        //compare this and the computer "c"
        double coeff1=this.evaluateCoefficient();
        double coeff2=c.evaluateCoefficient();
        if(coeff1>coeff2)
            return 1;
        if(coeff1<coeff2)
            return -1;
        return 0;
    }
}
