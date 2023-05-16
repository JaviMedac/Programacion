package reproductormúsica;
import java.util.Scanner;

public class ReproductorMúsica {

  
    public static void main(String[] args) {
       Canciones canción[] = new Canciones[10];
       Scanner entrada = new Scanner(System.in);
       canción[0]= new Canciones("ma", 2.3, "ma", "mg");
       canción[1]= new Canciones("fg", 2.3, "ma", "mg");
       canción[2]= new Canciones("mgf", 2.3, "ma", "mg");
       canción[3]= new Canciones("mfg", 2.3, "ma", "mg");
       canción[4]= new Canciones("fgfa", 2.3, "ma", "mg");
       canción[5]= new Canciones("mfg", 2.3, "ma", "mg");
       canción[6]= new Canciones("mfg", 2.3, "ma", "mg");
       canción[7]= new Canciones("fgfga", 2.3, "ma", "mg");
       canción[8]= new Canciones("fgfgv", 2.3, "ma", "mg");
       canción[9]= new Canciones("fvfdg", 2.3, "ma", "mg");
       System.out.println("Esta es la lista de canciones");
       System.out.println(canción[0].toString());
       System.out.println(canción[1].toString());
       System.out.println(canción[2].toString());
       System.out.println(canción[3].toString());
       System.out.println(canción[4].toString());
       System.out.println(canción[5].toString());
       System.out.println(canción[6].toString());
       System.out.println(canción[7].toString());
       System.out.println(canción[8].toString());
       System.out.println(canción[9].toString());
       for(int i = 0; i < canción.length; i++){
           System.out.println("Introduce una valoración para " + canción[i].getTitulo() + ": ");
           canción[i].setEstrellas(entrada.nextInt());
                      
       }
        System.out.println("");
        System.out.println("Lista de canciones de 1 estrella: ");
        System.out.println("");
       for (int i = 0; i < canción.length; i++){
           if(canción[i].getEstrellas() == 1){
               System.out.println(canción[i].toString());
           }
       }
        System.out.println("");
        System.out.println("Lista de canciones de 2 estrellas: ");
        System.out.println("");
       for (int i = 0; i < canción.length; i++){
           if(canción[i].getEstrellas() == 2){
               System.out.println(canción[i].toString());
           }
       }
        System.out.println("");
        System.out.println("Lista de canciones de 3 estrellas: ");
        System.out.println("");
       for (int i = 0; i < canción.length; i++){
           if(canción[i].getEstrellas() == 3){
               System.out.println(canción[i].toString());
           }
       }
        System.out.println("");
    }
}
    
    

