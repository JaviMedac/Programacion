package pkg1000km;

public class Carta implements Comparable<Carta> {

    protected String nombre;
    protected Integer valor;
    protected Boolean ataca;
    protected Integer iterador;

    public Carta() {

    }

    public Carta(String nombre, Boolean ataca) {
        this.nombre = nombre;
        this.ataca = ataca;
        valor = 0;
    }

    public Carta(String nombre, Integer iterador) {
        this.nombre = nombre;
        if (iterador == 0) {
            valor = 25;
        }
        if (iterador == 1) {
            valor = 50;
        }
        if (iterador == 2) {
            valor = 75;
        }
        if (iterador == 3) {
            valor = 100;
        }
        if (iterador == 4) {
            valor = 150;
        }
        if (iterador == 5) {
            valor = 200;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Boolean getAtaca() {
        return ataca;
    }

    public void setAtaca(Boolean ataca) {
        this.ataca = ataca;
    }

    @Override
    public String toString() {
        return nombre + " Valor: " + valor;
    }

    // MÉTODO PARA ORDENAR LOS VALORES EN EL MAZO
    @Override
    public int compareTo(Carta o1) {
        return Integer.valueOf(getValor()).compareTo(o1.getValor());
    }

}
