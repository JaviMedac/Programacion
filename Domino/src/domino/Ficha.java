package domino;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ficha {

    protected int numero1;
    protected int numero2;

    public Ficha(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public boolean compararNumero() {
        boolean comparador;
        if (numero1 == numero2) {
            comparador = true;
        } else {
            comparador = false;
        }
        return comparador;
    }

    @Override
    public String toString() {
        return numero1 + "|" + numero2;
    }

}
