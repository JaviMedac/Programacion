package practica3;

public class Practica3 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel President", "Calle Obsidiana nº5", 6);
        Persona persona1 = new Persona("Jose", "8474938X", 20);
        Persona persona2 = new Persona("Juan", "8484848T", 45);
        Persona persona3 = new Persona("Antonio", "5859938X", 42);
        Persona persona4 = new Persona("Guille", "03598583W", 46);
        Persona persona5 = new Persona("Alvaro", "75938459Z", 19);
        Factura factura1 = new Factura(persona1, "20/05/2022", true, 3, true, 1);
        Factura factura2 = new Factura(persona2, "20/05/2022", true, 1, true, 2);
        Factura factura3 = new Factura(persona3, "20/05/2022", false, 2, false, 3);
        Factura factura4 = new Factura(persona4, "20/05/2022", false, 3, false, 4);
        Factura factura5 = new Factura(persona5, "20/05/2022", true, 2, true, 5);
        // Enseñamos los datos de nuestro hotel y cada factura.
        System.out.println(hotel.toString());
        //hotel.ObtenerFacturas();    --> NO HE CONSEGUIDO QUE FUNCIONE ASÍ QUE LOS IMPRIMO A MANO
        System.out.print(factura1.toString() + "\n" + factura2.toString() + "\n" + factura3.toString());
        System.out.print("\n" + factura4.toString() + "\n" + factura5.toString());
        Factura facturas[] = {factura1, factura2, factura3, factura4, factura5}; //Creamos el array de facturas
        System.out.println("");
        System.out.println("");
        hotel.setFacturas(facturas); // Establecemos el array de facturas.
        //Llamamos al método que nos da el nombre de la persona a raiz de X factura.
        System.out.println("Sacamos el nombre de la persona a raiz de la factura 1");
        factura1.ObtenerNombre();
        //Llamamos al método que nos da los datos a raiz de un número de factura.
        System.out.println("A continuación sacamos los datos de factura desde su numero: ");
        hotel.ObtenerDatosNumero();
        System.out.println("");
        //Llamos al coste de cada una de las facturas
        System.out.println("El coste 1 es: " + factura1.Coste());
        System.out.println("El coste 2 es: " + factura2.Coste());
        System.out.println("El coste 3 es: " + factura3.Coste());
        System.out.println("El coste 4 es: " + factura4.Coste());
        System.out.println("El coste 5 es: " + factura5.Coste());
        //A continuación llamamos al metodo que es la suma de todos los costes.
        System.out.println("El coste total es: " + factura5.CosteTotal());
        System.out.println("A continuación obtenemos los datos de las facturas de una fecha: ");
        hotel.ObtenerDatosFecha();
        // IMPORTANTE --> Tanto para la elección de persona como de número, se elige la posición del array, por ende
        // nos va a imprimir la persona/numero relacionado a su posicion, por lo que puede existir la persona 0 o el numero 0.
        System.out.println("Por último, obtenemos los datos de una persona a partir de su nombre: ");
        hotel.ObtenerDatosNombre();
    }

}
