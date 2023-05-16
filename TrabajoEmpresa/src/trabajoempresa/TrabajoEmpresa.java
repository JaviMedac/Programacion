package trabajoempresa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TrabajoEmpresa {

    public static void main(String[] args) {
        //Implementa el control de acceso al area restringida de un programa, es decir, pedir un nombre de usuario y una contraseña.
        //Si el usuario ha introducido los datos correctamente, saldrá un mensaje de acierto, el usuario tendrá un máximo de 
        //3 oportunidades, ahi se acaba. Los nombres de usuarios y contraseñas van almacenados en un HashMap
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int contraseña;
        boolean aciertaU = false;
        HashMap<String, Integer> login = new HashMap();
        HashMap<String, Integer> intentos = new HashMap();

        login.put("Jorge", 1234);
        login.put("Juan", 3214);
        login.put("Javi", 4331);

        do {
            System.out.println("Introduce un usuario y una contraseña:");
            System.out.print("Usuario --> ");
            usuario = entrada.next();
            System.out.print("Contraseña --> ");
            contraseña = entrada.nextInt();
            if (login.containsKey(usuario) && login.get(usuario) == contraseña) {
                aciertaU = true;
            } else {
                intentos.put(usuario, contraseña);
            }

        } while (intentos.size() != 3 && aciertaU == false);
        if (intentos.size() == 3) {
            System.out.println("Has perdido por falta de intentos");
        } else {
            System.out.println("Has acertado la clave, era " + usuario + ", con contraseña: " + contraseña);
        }
    }

}
