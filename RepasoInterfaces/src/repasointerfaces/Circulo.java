package repasointerfaces;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        double area;
        area = (radio * radio) * Math.PI;
        System.out.println(area);
    }

    @Override
    public void perimetro() {
        double perimetro;
        perimetro = Math.PI * (radio * 2);
        System.out.println(perimetro);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Soy un círculo");
    }

}
