package PrintersMgt;

import ComputersMgt.Computer;

public class Printers {
    private Printer[] tab;
    private int nbrPrinters;

    public Printers() {
        tab=new Printer[100];
        nbrPrinters=0;
    }

    public void list() //affiche le stock des ordinateurs
    {
        System.out.println("Liste des Imprimentes :");
//        for (int i = 0; i < this.nbrComputers; i++) {
//            this.tab[i].show();
//        }
        //ou bien
        for (Printer x:this.tab ) {
            x.show();
        }
    }
    public Printer bestPrice()
    {
//        int min_index=0;
//        for (int i = 1; i <this.nbrPrinters ; i++) {
//            if(tab[i].getPrice()<tab[min_index].getPrice())
//                min_index=i;
//
//        }
//        return tab[min_index];
        //ou bien
    Printer best_printer=tab[0];
        for (Printer x:tab)
            if(x.getPrice()<best_printer.getPrice())
                best_printer=x;
        return best_printer;
    }
    public void sort() //ordre croissant de performance
    {


    }
}
