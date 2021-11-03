package PrintersMgt;

import Details.Provider;
import Enumerations.PrinterType;
import Enumerations.ProductState;

public class Printer {
    private long id;
    private Provider provider;
    private int speed;
    private int nbrPrintedPapers;
    private PrinterType type;
    private double price;
    private ProductState state;

    public Printer() {
    }

    public Printer(long id, Provider provider, int speed, int nbrPrintedPapers, PrinterType type, double price, ProductState state) {
        this.id = id;
        this.provider = provider;
        this.speed = speed;
        this.nbrPrintedPapers = nbrPrintedPapers;
        this.type = type;
        this.price = price;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNbrPrintedPapers() {
        return nbrPrintedPapers;
    }

    public void setNbrPrintedPapers(int nbrPrintedPapers) {
        this.nbrPrintedPapers = nbrPrintedPapers;
    }

    public PrinterType getType() {
        return type;
    }

    public void setType(PrinterType type) {
        this.type = type;
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
                "speed = "+this.speed+
                "nbre papers = "+this.nbrPrintedPapers+
                "price = "+this.price+
                "state = "+this.state+
                "type = "+this.type+
                "]"
        );
    }
    private double evaluateCoefficient()
    {
        int perform_type;
        switch (this.type)
        {
            case LASER:
                perform_type=40;
                break;
            case INKJET:
                perform_type=20;
                break;
                default:
                    perform_type=10;
        }
        return 0.5*perform_type+0.3*speed+0.2*nbrPrintedPapers;
    }
    public int compare(Printer p)
    {
        //compare "this" and the printer "p"
        double coeff1=this.evaluateCoefficient();
        double coeff2=p.evaluateCoefficient();
        if(coeff1>coeff2)
            return 1;
        if(coeff1<coeff2)
            return -1;
        return 0;
        //return (int)(coeff1-coeff2);//in this case the result'll be false
        //if -1<coeff1-coeff2<1
    }
}
