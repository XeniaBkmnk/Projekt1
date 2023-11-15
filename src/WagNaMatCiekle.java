import java.util.ArrayList;

public
    class WagNaMatCiekle<I>
        extends WagTowarPodst
implements InterfaceWagon<I>{

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

    public WagNaMatCiekle(String Id, int MaxWaga, int WagonPrad) {
        super(Id, MaxWaga, WagonPrad);
        this.Id=Id;
    }

    @Override
    public String toString() {
        return "WagNaMatCiekle{" +
                "Id=" + Id +
                '}';
    }

    @Override
    public void add(I ele) {

    }

    @Override
    public I get() {
        return null;
    }
}
