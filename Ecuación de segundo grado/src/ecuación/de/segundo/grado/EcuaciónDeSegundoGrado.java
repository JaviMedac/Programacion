/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuación.de.segundo.grado;
import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class EcuaciónDeSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a = 0, b = 0, c = 0, raiz;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingresa valores para a, b y c: ");
       a = entrada.nextDouble();
       b = entrada.nextDouble();
       c = entrada.nextDouble();
       raiz = Math.sqrt((b*b)-(4*a*c));
       if (a==0){
          System.out.println("No es una ecuación de segundo grado");
          
       }
       else{
           if (raiz >= 0){
          double fórmula1 = (((-b) + raiz) / (2*a));
          double fórmula2 = (((-b) - raiz) / (2*a));
          System.out.println("los 2 posibles resultados son: " + fórmula1 + " y " + fórmula2);
       }
       else 
           System.out.println("No tiene solución real");
       }

       }
       
       
    }
    

