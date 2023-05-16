package funcionesejclase;
import java.util.Scanner;
public class FuncionesEjClase {
    public static void main(String[] args) {
        char a;
        boolean vocal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        a = entrada.next().charAt(0);
        char b = Character.toLowerCase(a);
        vocal = esVocal(b);
        if(vocal){
            System.out.println(a + " es vocal");
        }
        else{
            System.out.println(a + " es consonante");
        }
    }
    public static boolean esVocal(char l){
        boolean vocal;
        if ((l=='a') || (l=='e') || (l=='o') || (l=='i') || (l=='u')){
            vocal = true;
            }
        else{
            vocal = false;
        }
              
        return vocal; 
    }
    
}
