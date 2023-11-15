import java.util.ArrayList;
public
    class Trasa {

        private int liczbaPrzesiadek;
        private int dlugoscTrasy;
        private String poczatek;
        private String konec;
        private ArrayList<String> stacje;


        public Trasa(int d) {
            this.stacje = new ArrayList<>();
            this.liczbaPrzesiadek = 0;
            this.dlugoscTrasy = 0;
            this.poczatek = "x";
            this.konec = "y";
        }

        public Trasa(Trasa t) {
            this.stacje = new ArrayList<>();

            for ( String i : t.getStacje() ) {
                this.stacje.add(i);
            }
            this.liczbaPrzesiadek = t.getLiczbaPrzesiadek();
            this.dlugoscTrasy = t.getDlugoscTrasy();
            this.poczatek = t.getPoczatek();
            this.konec = t.getAktualnaTrasa();
        }




        public ArrayList<String> getStacje() {
            return stacje;
        }

        public void setStacje(ArrayList<String> stacje) {
            this.stacje = stacje;
        }

        public int getLiczbaPrzesiadek() {
            return liczbaPrzesiadek;
        }

        public void setLiczbaPrzesiadek(int liczbaPrzesiadek) {
            this.liczbaPrzesiadek = liczbaPrzesiadek;
        }

        public int getDlugoscTrasy() {
            return dlugoscTrasy;
        }

        public void setDlugoscTrasy(int dlugoscTrasy) {
            this.dlugoscTrasy = dlugoscTrasy;
        }

        public String getPoczatek() {
            return poczatek;
        }

        public void setPoczatek(String poczatek) {
            this.poczatek = poczatek;
        }

        public String getAktualnaTrasa() {
            return konec;
        }

        public void setAktualnaTrasa(String aktualnaTrasa) {
            this.konec = aktualnaTrasa;
        }
}
