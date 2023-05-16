package orquesta;
import java.util.Scanner;


public abstract class Instrumento {
    public enum notas {DO,RE,MI,FA,SOL,LA,SI};
    protected notas nota[]; 
    protected int numNotas;
    protected int Tam_Max_Tabla = 100;
    

    public Instrumento() {
        nota = new notas[Tam_Max_Tabla];
        numNotas = 0;
    }
    public void addNota(notas n){
        if(numNotas < nota.length){
            nota[numNotas] = n;
            numNotas++;
        }
    }
    public void interpretar(){
        for (int i = 0; i<numNotas; i++){
            switch(nota[i]){
                case DO:
                    System.out.println("Do");
                    break;
                case RE:
                    System.out.println("Re");
                    break;
                case MI:
                    System.out.println("Mi");
                    break;
                case FA:
                    System.out.println("Fa");
                    break;
                case SOL:
                    System.out.println("Sol");
                    break;
                case LA:
                    System.out.println("La");
                    break;
                case SI:
                    System.out.println("Si");
                    break;
            }
        }
    }
    
}
