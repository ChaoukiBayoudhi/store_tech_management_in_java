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
    public void list() //affiche le stock des ordinateurs
    {
        System.out.println("Liste des Ordinateurs :");
//        for (int i = 0; i < this.nbrComputers; i++) {
//            this.tab[i].show();
//        }
        //ou bien
        for (Computer x:this.tab ) {
            x.show();
        }
    }

}
