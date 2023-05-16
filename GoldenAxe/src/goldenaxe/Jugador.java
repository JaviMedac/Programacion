package goldenaxe;

public class Jugador {

    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;
    protected String nombre;
    protected Carta carta[] = new Carta[5];

    public Jugador() {
        carta[0] = new Carta("Obtienes un punto de vida");
        carta[1] = new Carta("Te quitan un punto de vida");
        carta[2] = new Carta("Obtienes un punto de fuerza");
        carta[3] = new Carta("Te quitan un punto de fuerza");
        carta[4] = new Carta("Obtienes dos punto de vida");

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta getCarta(int posicion) {
        return carta[posicion];
    }

    public void setCarta(Carta[] carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Jugador --> " + "vida=" + vida + ", fuerza=" + fuerza + ", estaVivo=" + estaVivo + ", nombre=" + nombre;
    }
    

}
