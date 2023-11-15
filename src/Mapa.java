import java.util.*;
import java.util.stream.Collector;

public class Mapa {
    private HashMap<String, HashMap<String, Integer>> mapa;
    private String  poczatek;
    private ArrayList<Trasa> wyniki;

    private String StancaFinish;
    private String StancjaStart;
    private List<Polozenie> myPolozenie;


 //   private String Trasa;

    private Mapa(){
        this.myPolozenie = new LinkedList<>();
        this.mapa= new HashMap<>();
        this.wyniki=new ArrayList<>();
        wykonaj();
    }

    private void accept(Integer iVal){
        myPolozenie.add(
                new Polozenie( iVal, 0)
        );
    }
    private Mapa combine(Mapa otherMCT){
        throw new UnsupportedOperationException();
    }

    private List<Polozenie> finsh() {
        return myPolozenie;
    }

    public static Collector<Integer, ? , List<Polozenie>> collector(){
        return Collector.of(
                Mapa::new,
                Mapa::accept, //для добавления нового значения
                Mapa::combine,
                Mapa::finsh
        );
    }

    /*
    @Override
    public int compare(Trasa o1, Trasa o2) {
        return o1.getDlugoscTrasy() - o2.getDlugoscTrasy();

    }//koniec compare

 */
    private void wykonaj() {

    }


    Trasa t1;

    public  void searchConnections(String StancjaStart, String StancjaFinish ){
        this.StancjaStart = StancjaStart;
       szukaj(StancjaStart, StancjaFinish, new Trasa(t1));

    }

    private void szukaj(String stancjaStart, String stancaFinish, Trasa trasa) {

    }

  //  Collections.sort(wyniki, new Comparator<Trasa>(){

    }


    /*




    public void szukajPolaczenia(String poczatek, String koniec) {

        this.poczontek = poczatek;
        szukaj(poczatek, koniec, new trasa(""));

        //sortuje wyniki
        Collections.sort(wyniki, new Comparator<trasa>() {

            @Override
            public int compare(trasa o1, trasa o2) {
                return o1.getDlugoscTrasy() - o2.getDlugoscTrasy();
            }//koniec compare
        });//koniec sortowania



    }

     */
