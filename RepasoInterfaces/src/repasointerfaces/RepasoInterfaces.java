package repasointerfaces;

public class RepasoInterfaces {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(4.0);
        Triangulo triangulo1 = new Triangulo(2.4, 6.8);
        circulo1.area();
        circulo1.perimetro();
        circulo1.mostrarNombre();
        triangulo1.area();
        triangulo1.perimetro();
        triangulo1.mostrarNombre();
    }

}
