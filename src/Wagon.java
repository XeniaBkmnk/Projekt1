import java.util.ArrayList;
import java.util.Iterator;

class Wagon{

     private double MaxWaga;
     private int WagonPrad;

     boolean SiecElektr;
     private ArrayList<Wagon> listaWagon;


//     private ArrayList<Wagon> lista_Wagonow;
//
//     public ArrayList<Wagon> getLista_Wagonow() {
//          return lista_Wagonow;
//     }
//
//     public void setLista_Wagonow(ArrayList<Wagon> lista_Wagonow) {
//          this.lista_Wagonow = lista_Wagonow;
//     }

     public void setNrWagona(String nrWagona) {
          this.nrWagona = nrWagona;
     }
//???????????
     public void save() {
          Iterator<Wagon> it = listaWagon.iterator();
     }
     public ArrayList<Wagon> getListaWagon() {
          return listaWagon;
     }

     public void setListaWagon(ArrayList<Wagon> listaWagon) {
          this.listaWagon = listaWagon;
     }

     public boolean isSiecElektr() {
          return SiecElektr;
     }

     public void setSiecElektr(boolean siecElektr) {
          SiecElektr = siecElektr;
     }

     public int getWagonPrad() {
          return WagonPrad;
     }

     public void setWagonPrad(int wagonPrad) {
          WagonPrad = wagonPrad;
     }

     public double getMaxWaga() {
          return MaxWaga;
     }

     public void setMaxWaga(double maxWaga) {
          MaxWaga = maxWaga;
     }

     private String nrWagona;

     enum RodzajWagonow {
          PASAZERSKI, POCZTOWY, BAGAZOWO_POCZTOWY,
          RESTRACYJNY,TOWAROWY_PODSTAWOWY, TOWAROWY_CIEZKI,
          CHLODNICZY, NA_MATER_CIEKLE,NA_MATER_GAZOWE,
          NA_MATER_WYBUCHOWE, NA_MATER_TOX, NA_CIEKLE_MATER_TOX
     }

     @Override
     public String toString() {
          return "Wagon{" +
                  "MaxWaga=" + MaxWaga +
                  ", WagonPrad=" + WagonPrad +
                  ", SiecElektr=" + SiecElektr +
                  ", nrWagona='" + nrWagona + '\'' +
                  '}';
     }

     public Wagon (String nrWagona, double MaxWaga, int WagonPrad){

          this.MaxWaga=MaxWaga;
          this.WagonPrad=WagonPrad;
          this.nrWagona=nrWagona;
     }

     public String getNrWagona(){
          return nrWagona;
     }
}
