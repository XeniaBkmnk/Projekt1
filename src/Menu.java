import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Menu extends Thread { //?
    public static void main(String[] args) {
        {
            Wagon wagonik = new WagPas("13", 1, 5);
            Wagon wagonik2 = new WagRest("12", 1, 3);
            Wagon wagonik3 = new WagPocz("1", 10, 10);
            Wagon wagonik4 = new WagTowarCiez("2", 29, 50);
            Wagon wagonik5 = new WagTowarPodst("5", 30, 55);
            Wagon wagonik6 = new WagNaMatWybuchowe("6", 33, 59);
            Wagon wagonik7 = new WagNaMatGazowe("7", 55, 80);
            Wagon wagonik8 = new WagNaMatCiekle("8", 51, 90);
            Wagon wagonik9 = new WagNaCiekleMaterialyToksyczne("9", 50, 69);
            Wagon wagonik10 = new WagNaaterilyToksyczne("10", 48, 88);
            Wagon wagonik11 = new WagChlodniczy("11", 22, 99);

            //  Wagon wagonik3= new Wagon();


            ArrayList<Wagon> lista_Wagonow = new ArrayList<Wagon>();
            lista_Wagonow.add(wagonik);
            lista_Wagonow.add(wagonik2);
            lista_Wagonow.add(wagonik3);
            lista_Wagonow.add(wagonik4);
            lista_Wagonow.add(wagonik5);
            lista_Wagonow.add(wagonik6);
            lista_Wagonow.add(wagonik7);
            lista_Wagonow.add(wagonik8);
            lista_Wagonow.add(wagonik9);
            lista_Wagonow.add(wagonik10);
            lista_Wagonow.add(wagonik11);
            for (int i = 0; i < lista_Wagonow.size(); i++) {
            }
//                for (Wagon wagon : lista_Wagonow) {
//
//                }

                try {
                    Lokomotyw lokomotyw1 = new Lokomotyw(8, 1000, 7,
                            130.1, 1,
                            "Krakow", "Warszawa");
                    // Lokomotyw lokomotyw2 = new Lokomotyw(9, 1990, 9, 130.2, 3, "Warszawa", "Krakow");
                    // lokomotyw2.nazwaLokomotywa = "Fine";
                    lokomotyw1.nazwaLokomotywa = "Grin";
                    lokomotyw1.setListaWagon(lista_Wagonow);
                    lokomotyw1.save(); //mowe zeby zrobil mi
                    // lokomotyw2.save();


//        metoda();
//        metoda_2();
//mapa na stacji

                    Map<Lokomotyw, List<Wagon>> mapaWagonow = new HashMap<>();
                    mapaWagonow.put(lokomotyw1, new ArrayList<>());
                    mapaWagonow.get(lokomotyw1).add(wagonik);


                    List<Lokomotyw> listaLokomotyw = new ArrayList() {
                    };
                    listaLokomotyw.add(lokomotyw1);
                    // lista_Lokomotyw.add(lokomotyw2);
                    listaLokomotyw.add(new Lokomotyw(7, 1000, 7, 130.1, 1, "Krakow", "Warszawa"));
                    for (int j = 0; j < listaLokomotyw.size(); j++) {
                        //System.out.println(lista_Lokomotyw.get(j));
                    }
//            ArrayList listaLokomtyw = new ArrayList();
//            listaLokomtyw.add(lokomotyw2);
//            listaLokomtyw.add(lokomotyw1);
//            System.out.println("--------------");
//            for (Object L : listaLokomtyw) {
//                System.out.println(((Lokomotyw) L).nazwaLokomotywa);
//            }
//            System.out.println("--------------");
//
//            System.out.println(((Lokomotyw) listaLokomtyw.get(0)).nazwaLokomotywa);
//            System.out.println(listaLokomtyw.size());
//            System.out.println(listaLokomtyw.contains(2));
//            listaLokomtyw.remove(lokomotyw1);//удаление
                    for (Wagon wagon : lista_Wagonow) {
                        System.out.println(wagon);
                    }

                    System.out.println(lista_Wagonow);


                    //    aktualizujemy prędkość dla każdego pociągu *kturego nie mam ide po lokomotywie
                    lokomotyw1.start();


                } catch (NullPointerException o) {
                    System.out.println("Wystąpił błąd: " + o.getMessage());
//            lista_Wagonow.add(wagonik);
//            lista_Wagonow.add(wagonik2);
//            lista_Wagonow.add(wagonik3);
//            lista_Wagonow.add(wagonik4);
//            lista_Wagonow.add(wagonik5);
//            lista_Wagonow.add(wagonik6);
//            lista_Wagonow.add(wagonik7);
//            lista_Wagonow.add(wagonik8);
//            lista_Wagonow.add(wagonik9);
//            lista_Wagonow.add(wagonik10);
//            lista_Wagonow.add(wagonik11);
//            for (int i = 0; i < lista_Wagonow.size(); i++) {
//                System.out.println(lista_Wagonow.get(i)); //
                }
            }

        {
//---------------------------------------jezeli to zmieniac mejstami to w pliku .txt bede zapisany rozny informacji
            {
                //===rozklad

                ArrayList<String> route = new ArrayList<String>();
                route.add("Stacja 1");
                route.add("Stacja 2");
                route.add("Stacja docelowa");
                route.add("Stacja 2");
                route.add("Stacja 1");

                int totalTime = 0;

                try {
                    FileWriter writer = new FileWriter("AppState.txt");

                    for (String station : route) {
                        writer.write("Obecna stacja: " + station + "\n");
                        totalTime += 2; // czas postoju na stacjach pośrednich

                        if (station.equals("Stacja docelowa")) {
                            writer.write("Pociąg czeka 30 sekund na stacji docelowej\n");
                            totalTime += 30;
                        }
                    }

                    writer.write("Całkowity czas podróży: " + totalTime + " sekund");
                    writer.close();

                    System.out.println("Dane zapisane do pliku");
                } catch (IOException e) {
                    System.out.println("błąd ");
                    e.printStackTrace();
                }
            }



            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            Menu thread = new Menu();
//            thread.start();
//        lokomotyw1.interrupt();
//        lokomotyw2.interrupt();

            {
                List<Polozenie> myPolozenie = Stream
                        .generate(Math::random)
                        .limit(10)
                        .map(v -> (int) (v * 99))
                        .collect(Mapa.collector());

                System.out.println("=======================");
                myPolozenie
                        .stream()
                        .forEach(System.out::println);

            }

        }
    }
}
