package goldenaxe;

public class Carta {
    String fraseCarta;
    int vida,fuerza;
    public Carta(String fraseCarta){
        this.fraseCarta = fraseCarta;
        
    }
    public Carta(String fraseCarta,int vida, int fuerza){
        this.fraseCarta = fraseCarta;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public String getFraseCarta() {
        return fraseCarta;
    }

    public void setFraseCarta(String fraseCarta) {
        this.fraseCarta = fraseCarta;
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
    

}
