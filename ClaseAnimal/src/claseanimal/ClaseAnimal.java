package claseanimal;


public class ClaseAnimal {

  
    public static void main(String[] args) {
        Animal perro = new Animal();
        Animal gato = new Animal("Gato");
        Animal pato = new Animal("Pato",'m',4,true);
        perro.mostrarAnimal();
        System.out.println("");
        gato.mostrarAnimal();
        System.out.println("");
        pato.mostrarAnimal();
    }
    
}
