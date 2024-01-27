import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public
    class Lokomotyw extends Thread {
    private static int nrobiektu = 0;
    String nazwaLokomotywa;
    int IloscWagon;
    private double MaxWaga;
    private int WagonPrad;
    private int locomotyweNumber;
    private double PredkoscLokomotywa; //currentLokomotywa
    private int MaxLiczPodlacxSieciElektrycz;

    private String StasjaPocziontkowa;
    private String StacjaKoncowa;

    public static int getNrobiektu() {
        return nrobiektu;
    }

    public static void setNrobiektu(int nrobiektu) {
        Lokomotyw.nrobiektu = nrobiektu;
    }

    public String getNazwaLokomotywa() {
        return nazwaLokomotywa;
    }

    public void setNazwaLokomotywa(String nazwaLokomotywa) {
        this.nazwaLokomotywa = nazwaLokomotywa;
    }

    public int getIloscWagon() {
        return IloscWagon;
    }

    public void setIloscWagon(int iloscWagon) {
        IloscWagon = iloscWagon;
    }

    public double getMaxWaga() {
        return MaxWaga;
    }

    public void setMaxWaga(double maxWaga) {
        MaxWaga = maxWaga;
    }

    public int getWagonPrad() {
        return WagonPrad;
    }

    public void setWagonPrad(int wagonPrad) {
        WagonPrad = wagonPrad;
    }

    public int getLocomotyweNumber() {
        return locomotyweNumber;
    }

    public void setLocomotyweNumber(int locomotyweNumber) {
        this.locomotyweNumber = locomotyweNumber;
    }

    public double getPredkoscLokomotywa() {
        return PredkoscLokomotywa;
    }

    public void setPredkoscLokomotywa(double predkoscLokomotywa) {
        PredkoscLokomotywa = predkoscLokomotywa;
    }

    public int getMaxLiczPodlacxSieciElektrycz() {
        return MaxLiczPodlacxSieciElektrycz;
    }

    public void setMaxLiczPodlacxSieciElektrycz(int maxLiczPodlacxSieciElektrycz) {
        MaxLiczPodlacxSieciElektrycz = maxLiczPodlacxSieciElektrycz;
    }

    public String getStasjaPocziontkowa() {
        return StasjaPocziontkowa;
    }

    public void setStasjaPocziontkowa(String stasjaPocziontkowa) {
        StasjaPocziontkowa = stasjaPocziontkowa;
    }

    public String getStacjaKoncowa() {
        return StacjaKoncowa;
    }

    public void setStacjaKoncowa(String stacjaKoncowa) {
        StacjaKoncowa = stacjaKoncowa;
    }

    private ArrayList<Wagon> listaWagon;


//    public void setLista_Wagonow(ArrayList<Wagon> lista_Wagonow) {
//        this.lista_Wagonow = lista_Wagonow;
//    }

    private List<Lokomotyw> lista_Lokomotyw;

    public List<Lokomotyw> getLista_Lokomotyw() {
        return lista_Lokomotyw;
    }

    public void setLista_Lokomotyw(List<Lokomotyw> lista_Lokomotyw) {
        this.lista_Lokomotyw = lista_Lokomotyw;
    }

    public ArrayList<Wagon> getListaWagon() {
        return listaWagon;
    }

    public void save(){ //lista_Wagonow
        try {
            File file = new File("AppState.txt");
            FileWriter writer = new FileWriter(file);
            String text=this.toString(); //to po lokomotywie
            writer.write(text + "\n");
            //if(listaWagon.size()==0) System.out.println("problem"); //niby size>0 bo wypisuje wagony
            for(Wagon wagon: listaWagon) { // to  po wagonu bylo lista_Wagonow
                text = wagon.toString();
                writer.write("\n"+text);
                //System.out.println("\n"+text);
            }
            //System.out.println(writer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setListaWagon(ArrayList<Wagon> listaWagon) {
        this.listaWagon = listaWagon;
    }

    public Lokomotyw(
            int IloscWagon, double MaxWaga, int WagonPrad,
            double PredkoscLokomotywa, int MaxLiczPodlacxSieciElektrycz, String StacjaKoncowa,
            String StasjaPocziontkowa
    ) {
        this.IloscWagon = IloscWagon;
        this.MaxWaga = MaxWaga;
        this.WagonPrad = WagonPrad;
        String nazwaLokomotywa;
        //this.locomotyweNumber=locomotyweNumber;
        this.PredkoscLokomotywa = PredkoscLokomotywa;
        this.MaxLiczPodlacxSieciElektrycz = MaxLiczPodlacxSieciElektrycz;
        this.StacjaKoncowa = StacjaKoncowa;
        this.StasjaPocziontkowa = StasjaPocziontkowa;
        nrobiektu++; // id nadawany automa-tycznie podczas tworzenia obiektu
        this.locomotyweNumber = nrobiektu;
        this.listaWagon=new ArrayList<>();
    }

//( Math.random()) ->  {

    @Override
    public void run() {

        while(!this.isInterrupted()){  //kontrola potoka

            updateSpeed();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { //block
                throw new RuntimeException(e); //logok bled
            }

        }

    }
//szybkosc aktualizacji
    public void updateSpeed(){

        double zmiana = this.PredkoscLokomotywa * 0.03; // losowa zmiana prędkości o 3%
        double znak = Math.random() < 0.5 ? -1 : 1; // losujemy znak zmiany
        this.PredkoscLokomotywa += znak * zmiana; // aktualizujemy prędkość
        System.out.println(this.PredkoscLokomotywa);

    }
// Stream.generate(Math::random)
//            .limit(10)
//            .forEach(System.out::println);

    @Override
    public String toString() {
        return "Lokomotyw{" +
                "nazwaLokomotywa='" + nazwaLokomotywa + '\'' +
                ", IloscWagon=" + IloscWagon +
                ", MaxWaga=" + MaxWaga +
                ", WagonPrad=" + WagonPrad +
                ", locomotyweNumber=" + locomotyweNumber +
                ", PredkoscLokomotywa=" + PredkoscLokomotywa +
                ", MaxLiczPodlacxSieciElektrycz=" + MaxLiczPodlacxSieciElektrycz +
                ", StasjaPocziontkowa='" + StasjaPocziontkowa + '\'' +
                ", StacjaKoncowa='" + StacjaKoncowa + '\'' +
                '}';
    }
        
}
