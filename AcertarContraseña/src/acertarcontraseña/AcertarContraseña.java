package acertarcontraseña;
import java.util.Scanner;
import java.util.Arrays;


public class AcertarContraseña {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contraseña;
        String intento;
        boolean reintento = false;
        System.out.println("Introduce una contraseña ");
        contraseña = entrada.nextLine();
        System.out.println("Intenta adivinar la contraseña: La contraseña tiene " + contraseña.length() + " carácteres");
        intento = entrada.nextLine();
        //System.out.println(contraseña.equals(intento));
        if (intento.equals(contraseña)){
            System.out.println("Enhorabuena, has adivinado la contraseña");
        }
        else{
            System.out.println("Error,aquí tienes una pista: ");
            System.out.println("La primera letra es: " + contraseña.charAt(0) + " y la última es: " + (contraseña.charAt(contraseña.length() - 1)));
        }
        if (!contraseña.equals(intento)){
        System.out.println("Ahora, inténtalo de nuevo: ");
        intento = entrada.nextLine();
            if(!contraseña.equals(intento)){
                System.out.println("Con esta última pista deberías adivinarla: ");
                System.out.println(contraseña.subSequence(0, (contraseña.length()/2)) + "_" + contraseña.substring(((contraseña.length()/2) + 1),contraseña.length() ));
            }
            else{
                System.out.println("Enhorabuena, has adivinado la contraseña");
            }
        }
        if (!contraseña.equals(intento)){
            System.out.println("Inténtalo de nuevo: ");
            intento = entrada.nextLine();
            if(!contraseña.equals(intento)){
                System.out.println("Error, tienes un último intento: ");
                intento = entrada.nextLine();
                if (intento.equals(contraseña)){
                        reintento = true;
                }
                else{
                    System.out.println("Lo siento, te has quedado sin intentos");
                }
            }
            else{
                System.out.println("Enhorabuena, has adivinado la contraseña");
            }
        }
        if (reintento){
            System.out.println("Enhorabuena , has adivinado la contraseña");
        }
        
        }
    }
    

