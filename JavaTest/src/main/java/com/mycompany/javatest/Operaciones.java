package com.mycompany.javatest;

public class Operaciones {

    private int n1;
    private int n2;

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int suma(int n1, int n2) {
        return n1 + n2;
    }

    public int resta(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    public double division(int n1, int n2) {
        try{
        if (n2 == 0) {
            throw new ArithmeticException("No se puede divivir porque es 0");

        } else {
            return n1 / n2;
        }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return n1 / n2;
    }
}
