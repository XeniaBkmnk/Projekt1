import java.util.ArrayList;
import java.util.List;

public class TrainStation extends Sklad {
    private static final String[] STATION_NAMES = {"S1", "S2", "S3", /* ... */ "S100"};
    private static final String[] LOCOMOTIVE_MODELS = {"Model 1"};
    private static final String[] WAGON_TYPES = {""};
    private static final int MIN_TRAIN_LENGTH = 9;
    private static final int MAX_TRAIN_LENGTH = 10;
    private static final int MIN_WAGON_WEIGHT = 100;
    private static final int MAX_WAGON_WEIGHT = 900;
    private String name;

    public TrainStation(int id, Polozenie polozenie, int predkosc, boolean dzialaj,
                        List<Lokalizacja> trasa, Lokalizacja najblizszyCel, int maxPojemnosc, int maxSila,
                        ArrayList<Wagon> listaWagon, int bezoncaSila, String name) throws SkladFullException {
        super(id, polozenie, predkosc, dzialaj, trasa, najblizszyCel, maxPojemnosc, maxSila, listaWagon, bezoncaSila);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {

    }
}
