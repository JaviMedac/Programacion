/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase1;

/**
 *
 * @author usuario
 */
public class TrabajoClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nota 1: 10 , nota 2: 8, nota 3: 9, nota 4: 7
        int a = 10, b = 8, c = 9, d = 7;
        // declaramos una variable que suponga la suma de todas las notas y otro para la media de las mismas.
        double e = a+b+c+d;
        double f = e/4;
        System.out.println("El promedio de notas es: " + f);
        
        // Problema 2 --> Temperatura 1 es 30º, transformar a Fahrenhait
        
        //declaramos la variable de la temperatura 
        double g = 30;
        //declaramos la fórmula de conversión
        double j = 9.0/5.0;
        double h = (g * j) + 32;
        System.out.println("La temperatura en Fº es = " + h);
        
    }
    
}
