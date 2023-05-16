/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        numero = entrada.nextInt();
        switch (numero){
        case 1:
        System.out.println("Hola");
        break;
        case 2:
        System.out.println("a la clase");
        break;
        case 3:
        System.out.println("de progamación");
        break;
        case 4:
        System.out.println("de 1ºA");
        break;
        default:
        System.out.println("Adiós");
        break;
       
         
    }
    }
    
}
