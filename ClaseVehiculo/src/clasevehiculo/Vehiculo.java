
package clasevehiculo;


public class Vehiculo {
    int ruedas;
    String marca;
    String modelo;
    char[] matricula = new char[7];
    
    Vehiculo(){
    
    }
    Vehiculo(int r){
        this.ruedas = r;
    }
    Vehiculo(int r, String mc, String ml, char[] mt){
        this.ruedas = r;
        this.marca = mc;
        this.modelo = ml;
        for(int i = 0; i < matricula.length; i++){
        this.matricula[i] = mt[i];        
        }
    }
    public void mostrarVehiculo(){
        System.out.println("Tiene " + this.ruedas + " ruedas");
        System.out.println("Es la marca: " + this.marca);
        System.out.println("Es el modelo: " + this.modelo);
        System.out.print("Tiene como matricula: ");
        for(int i = 0; i < matricula.length; i++){
        System.out.print(this.matricula[i]);
        }
    }
}
