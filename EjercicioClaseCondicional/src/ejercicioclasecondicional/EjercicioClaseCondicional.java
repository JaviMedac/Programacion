/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclasecondicional;
import java.util.Scanner;

public class EjercicioClaseCondicional {
   
    // Tiramos 3 dedos, si los 3 dados dan 6, resultado es excelente, 2 dan 6 está muy bien, 1 da 6 regular, ninguno da 6 pésimo.

    
    public static void main(String[] args) {
        int dado1 = 0, dado2 = 0, dado3 = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa dado 1");
    dado1 = entrada.nextInt();
    System.out.println("Ingresa dado 2");
    dado2 = entrada.nextInt();
    System.out.println("Ingresa dado 3");
    dado3 = entrada.nextInt();
        if ((dado1 == 6) && (dado2 == 6) && (dado3 == 6)) {
            System.out.println("El resultado es excelente");
            }
        else if ((dado1 == 6) && (dado2 == 6) && (dado3 != 6)){
            System.out.println("El resultado está muy bien");
        }
        else if ((dado1 == 6) && (dado2 !=6) && (dado3 == 6)){
            System.out.println("El resultado está muy bien");
        }
        else if ((dado1 != 6) && (dado2 ==6) && (dado3 ==6)){
            System.out.println("El resultado está muy bien");
                    }
        else if ((dado1 == 6) && (dado2 != 6) && (dado3 != 6)){
        System.out.println("El resultado está regular");
        }
        else if ((dado1 != 6) && (dado2 == 6) && (dado3 != 6)){
                System.out.println("El resultado está regular");
                }
        else if ((dado1 != 6) && (dado2 != 6) && (dado3 == 6)){
            System.out.println("El resultado está regular");
        }
        else if ((dado1 != 6) && (dado2 != 6) && (dado3 != 6)){
            System.out.println("El resultado es pésimo");
        }
        
    
        
            
        
            
        }
    
        
        
    }
    

