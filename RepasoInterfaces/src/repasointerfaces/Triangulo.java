package repasointerfaces;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void area() {
        double area;
        area = (base * altura) / 2;
        System.out.println(area);
    }

    @Override
    public void perimetro() {
        double perimetro;
        perimetro = base * 3;
        System.out.println(perimetro);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Soy un triángulo");
    }

}
