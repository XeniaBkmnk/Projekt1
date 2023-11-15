import java.util.ArrayList;

public
     class WagRest<S>
        extends Wagon
implements SeciElektro<S>{
     String Id;
     private ArrayList<Wagon> listaWagon;

     public String getId() {
          return Id;
     }

     public void setId(String id) {
          Id = id;
     }

     @Override
     public ArrayList<Wagon> getListaWagon() {
          return listaWagon;
     }

     @Override
     public void setListaWagon(ArrayList<Wagon> listaWagon) {
          this.listaWagon = listaWagon;
     }

     public WagRest(String Id, double MaxWaga, int WagonPrad) {
          super(Id, MaxWaga, WagonPrad);
          this.Id=Id;
     }

     @Override
     public String toString() {
          return "WagRest{" +
                  "Id=" + Id +
                  '}';
     }

     @Override
     public void add(S ele) {

     }

     @Override
     public S get() {
          return null;
     }
}
