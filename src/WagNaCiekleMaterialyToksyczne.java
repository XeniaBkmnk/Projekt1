import java.util.ArrayList;

public
    class WagNaCiekleMaterialyToksyczne<T>
        extends WagTowarCiez
        implements MateriałyCiekłe<T>
//implements InterfaceWagon<I>
    {

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

    public WagNaCiekleMaterialyToksyczne(String Id, int MaxWaga, int WagonPrad) {
        super(Id, MaxWaga, WagonPrad);
        this.Id=Id;
        }

    @Override
    public String toString() {
        return "WagNaCiekleMaterialyToksyczne{" +
                "Id=" + Id +
                '}';
    }

    @Override
    public void add(T ele) {

    }

    @Override
    public T get() {
        return null;
    }


//    public WagNaCiekleMaterialyToksyczne(int IloscWagon, double MaxWaga, int WagonPrad) {
//        super(IloscWagon, MaxWaga, WagonPrad);
//    }
}
