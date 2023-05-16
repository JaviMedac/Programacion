/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchprueba;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SwitchPRueba {

   
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, mayor = 0, menor = 0, mediano = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 3 números: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        switch (1){
            case 1:
                if ((a>=b) && (a>=c)){
                    mayor = a;
                    if (b>c){
                        mediano = b;
                        menor = c;}
                        else 
                                menor = b;
                                mediano = c;
                                }
                case 2:
                if ((b>a) && (b>=c)){
                    mayor = b;
                    if (a>c){
                        mediano = a;
                        menor = c;}
                        else 
                                menor = a;
                                mediano = c;
                                }
                case 3:
                if ((c>b) && (c>a)){
                    mayor = c;
                    if (b>a){
                        mediano = b;
                        menor = a;}
                        else 
                                menor = b;
                                mediano = a;
                                }
        }
        
         System.out.println(mayor + ">" + mediano + ">" + menor);           
                }
        }
    
    

