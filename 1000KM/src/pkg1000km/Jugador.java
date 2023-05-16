package pkg1000km;

import java.util.ArrayList;

public class Jugador {

    protected ArrayList<Carta> mazo;
    protected Integer kilometros;

    public Jugador(ArrayList mazo, Integer kilometros) {
        this.mazo = mazo;
        this.kilometros = kilometros;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public Integer getKilometros() {
        return kilometros;
    }

    public void setKilometros(Integer kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "\nTus cartas son: " + mazo + "  Tus kilometros recorridos son: " + kilometros;
    }

}
