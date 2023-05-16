package ejercicioalien;

public class Jugador {

    private String nombre;
    private boolean infectado;
    private int posicionx;
    private int posiciony;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.infectado = false;
        this.posicionx = (int) (Math.random() * 10);
        this.posiciony = (int) (Math.random() * 10);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInfectado() {
        return infectado;
    }

    public void setInfectado(boolean infectado) {
        this.infectado = infectado;
    }

    public int getPosicionx() {
        return posicionx;
    }

    public void setPosicionx(int posicionx) {
        this.posicionx = posicionx;
    }

    public int getPosiciony() {
        return posiciony;
    }

    public void setPosiciony(int posiciony) {
        this.posiciony = posiciony;
    }

}
