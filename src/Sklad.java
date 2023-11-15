import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract
    class Sklad
        implements Runnable {


//public Sklad(ArrayList<Wagon> lista_Wagonow , List<Lokomotyw> lista_Lokomotyw) {}

    private Polozenie polozenie;
        private int id;
    private List<Sklad> stations;
    private List<Sklad> trains;
    private int predkosc;
    private boolean dzialaj;
    private List<Lokalizacja> trasa;
    private Lokalizacja najblizszyCel;

    private int maxPojemnosc;
    private final int maxSila;
    private ArrayList<Wagon> listaWagon;

    public ArrayList<Wagon> getListaWagon() {
        return listaWagon;
    }

    public void setListaWagon(ArrayList<Wagon> listaWagon) {
        this.listaWagon = listaWagon;
    }

    private int bezoncaSila = 0;

    public Sklad(int id,Polozenie polozenie, int predkosc, boolean dzialaj, List<Lokalizacja> trasa,
                 Lokalizacja najblizszyCel, int maxPojemnosc, int maxSila, ArrayList<Wagon> listaWagon,
                 int bezoncaSila) throws SkladFullException {
        this.polozenie = new Polozenie(polozenie.getX(), polozenie.getY());
        this.predkosc = predkosc;
        this.id= id;
        this.dzialaj = true;
        this.trasa = trasa;
        //this.kierunek = Kierunek.ZADEN;
        this.najblizszyCel = najblizszyCel;
        this.maxPojemnosc = maxPojemnosc;
        this.maxSila = maxSila;
        this.listaWagon = listaWagon;
        this.bezoncaSila = bezoncaSila;
//        losujTrase(polozenie);
//             this.zmienCel(trasa.listIterator().next());
    }




    public List<Lokalizacja> getTrasa() {
        return trasa;
    }

    public void addWagon(Wagon wagon) throws SkladFullException {
        if (listaWagon.size() >= maxPojemnosc) {
            throw new SkladFullException("pociag jest pelny");
        }
        listaWagon.add(wagon);
        bezoncaSila += wagon.getMaxWaga();

        if (bezoncaSila + wagon.getMaxWaga() > maxSila) {
            throw new SkladFullException("pociąg jest zbyt ciężki");
        }

        listaWagon.add(wagon);
        bezoncaSila += wagon.getMaxWaga();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Sklad{" +
                "polozenie=" + polozenie +
                ", id=" + id +
                ", stations=" + stations +
                ", trains=" + trains +
                ", predkosc=" + predkosc +
                ", dzialaj=" + dzialaj +
                ", trasa=" + trasa +
                ", najblizszyCel=" + najblizszyCel +
                ", maxPojemnosc=" + maxPojemnosc +
                ", maxSila=" + maxSila +
                ", listaWagon=" + listaWagon +
                ", bezoncaSila=" + bezoncaSila +
                '}';
    }
}
     class SkladFullException
                extends Exception {
        public SkladFullException(String message) {
            super(message);
        }


//    public Sklad(Polozenie polozenie, int predkosc, List<Lokalizacja> trasa,double MaxWaga,int WagonPrad) {
//        super(maxCapacity,maxTraction, MaxWaga, WagonPrad);
//        this.polozenie = new Polozenie(polozenie.getX(), polozenie.getY());
//        this.predkosc = predkosc;
//        this.trasa = trasa;
//        // this.kierunek = Kierunek.ZADEN;
//        this.dzialaj = true;
////        losujTrase(polozenie);
//        //        this.zmienCel(trasa.listIterator().next());
//
//
//
//    public Sklad(Polozenie polozenie, int predkosc, Lokalizacja najblizszyCel, List<Lokalizacja> trasa) {
//        this(polozenie, predkosc, trasa);
//        this.najblizszyCel = najblizszyCel;
//
//        this.trasa = new LinkedList<>();
//        znajdzTrase(najblizszyCel);
//    }


}