package ejarraybidimensional;
import java.util.Scanner;
import java.util.Arrays;


public class EjArrayBidimensional {


    public static void main(String[] args) {
        int matriz1[][] = new int [10][10];
        int barco1 [] = {1,1,1,1,1};
        int barco2 [] = {2,2,2};
        int barco3 [] = {3};      
        for (int fila = 0; fila < matriz1.length; fila++){
            for (int columna = 0; columna < matriz1[fila].length; columna++){
                double random1 = Math.random() * 10;
                int x = (int) random1;
                double random2 = Math.random() * 10;
                int y = (int) random2;
                double random3 = Math.random() * 2;
                int orientación = (int) random3;

           }     

        } 
    }       
    
}
