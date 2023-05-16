/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase.pkg29.pkg09;
import java.util.Scanner;

public class EjerciciosClase2909 {

    
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 3 números: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        if ((a>b) && (a>c) && (b>c)){
            System.out.println(a + ">" + b + ">" + c);
        }
        else if ((b>a) && (b>c) && (a>c)){
            System.out.println(b + ">" + a + ">" + c);
        }
        else if ((c>a) && (c>b) && (a>b)){
            System.out.println(c + ">" + a + ">" + b);
        }
        else if ((a>b) && (a>c) && (c>b)){
            System.out.println(a + ">" + c + ">" + b);
            }
        else if ((b>a) && (b>c) && (c>a)){
            System.out.println(b + ">" + c + ">" + a);
        }
        else if ((c>a) && (c>b) && (b>a)){
            System.out.println(c + ">" + b + ">" + a);
        }
        else {
            System.out.println("Error, hay números iguales");
        }
        
        
    }
}
       