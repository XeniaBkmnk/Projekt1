import java.util.ArrayList;

public
    class WagChlodniczy<S>
    extends WagTowarPodst
    implements SeciElektro<S>{
    String Id;
    private ArrayList<Wagon> listaWagon;

    @Override
    public String getId() {
        return Id;
    }

    @Override
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
//  private int SiecElektr; //boolean SiecElektr??

    public WagChlodniczy(String Id, int MaxWaga, int WagonPrad){
        super(Id,  MaxWaga, WagonPrad);
        //this.SiecElektr=SiecElektr;
        this.Id=Id;
    }

    @Override
    public String toString() {
        return "WagChlodniczy{" +
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
