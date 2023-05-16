package goldenaxe;

public class Cthulhu {

    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;

    public Cthulhu(int vida, boolean estaVivo) {
        this.vida = vida;
        this.fuerza = 1;
        this.estaVivo = estaVivo;
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
    

}
