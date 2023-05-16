
package clasevehiculo;
import java.util.Scanner;


public class ClaseVehiculo {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vehiculo coche = new Vehiculo();
        char[] array = new char[7];
        System.out.println("Introduce la matrícula del vehículo: ");
        for(int i = 0; i < array.length; i++){
            array[i] = entrada.next().charAt(0);
        }
        Vehiculo moto = new Vehiculo(2, "Yamaha", "R8" , array);
        moto.mostrarVehiculo();
        System.out.println("");
        
    }
    
}
