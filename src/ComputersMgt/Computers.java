package ComputersMgt;

public class Computers {
    private Computer[] tab;
    private int nbrComputers;
    //surcharge of constructors
    public Computers() {
        tab=new Computer[50];
        nbrComputers=0;
    }
    public Computers(int size) {
        tab=new Computer[size];
        nbrComputers=0;
    }
    public Computers(Computer[] tab, int nbrComputers) {
        this.tab = tab;
        this.nbrComputers = nbrComputers;
    }

}
