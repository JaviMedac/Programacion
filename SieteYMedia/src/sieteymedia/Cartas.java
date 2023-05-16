package sieteymedia;

public class Cartas {

    protected int num;
    protected String palo;
    protected double peso;

    public Cartas(int num, String palo) {
        this.num = num;
        this.palo = palo;
        if (num >= 10) {
            peso = 0.5;
        } else {
            peso = num;
        }
    }
}
