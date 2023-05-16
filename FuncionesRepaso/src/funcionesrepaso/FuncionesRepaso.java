package funcionesrepaso;


public class FuncionesRepaso {


    public static void main(String[] args) {
        double figura1, figura2, figura3, figura4;
        figura1 = rectangulo(12,6) + (circulo(2)/2) + (triangulo(2,2)) * 2 + cuadrado(2);
        System.out.println(Math.round(figura1) + " m^2");   
        figura2 = rectangulo(26,10) + (circulo(2)/2) + (circulo(2)/2) + (triangulo(4,4))*2 - (circulo(2)) * 2;
        System.out.println(Math.round(figura2) + " m^2");
        figura3 = rectangulo(10,8) + triangulo(3,8) + (triangulo(3,7)) * 2 + cuadrado(6) + (circulo(6)) / 2;
        System.out.println(Math.round(figura3) + " m^2");
        figura4 = rectangulo(6,4) + triangulo(6,2) + cuadrado(2) + (triangulo(1,2))*3;
        System.out.println(Math.round(figura4) + " m^2");
    }
    public static double circulo(double r){
        double area = Math.PI * (r * r);
        return area;
    }
    public static double rectangulo(double base, double altura){
        double area2 = base * altura;
        return area2;
    }
    public static double cuadrado(double lado){
        double area3 = lado * lado;
        return area3;
    }
    public static double triangulo(double base, double altura){
        double area4 = (base * altura) / 2;
        return area4;
    }
}
