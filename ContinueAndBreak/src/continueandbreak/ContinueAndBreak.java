package continueandbreak;
import java.util.Scanner;
public class ContinueAndBreak {

   
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 2 números: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        if (a>b){
            System.out.println(a + " es mayor que " + b);
        }
        else if (b>a){
            System.out.println(b + " es mayor que " + a);
        }
        else{
            System.out.println("Son el mismo número");
        }
        
    }
    
}
