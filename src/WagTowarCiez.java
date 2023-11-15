import java.util.ArrayList;

public
     class WagTowarCiez
        extends Wagon{
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

     public WagTowarCiez(String Id, int MaxWaga, int WagonPrad) {
          super(Id, MaxWaga, WagonPrad);
          this.Id=Id;
     }

     @Override
     public String toString() {
          return "WagTowarCiez{" +
                  "Id=" + Id +
                  '}';
     }
}
