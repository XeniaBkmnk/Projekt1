public class Polozenie {
    private int x;
        private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Polozenie(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public boolean Porownac(Polozenie polozenie) {
        return (this.x == polozenie.getX() && this.y == polozenie.getY());
    }


    @Override
    public String toString() {
        return "Polozenie{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
