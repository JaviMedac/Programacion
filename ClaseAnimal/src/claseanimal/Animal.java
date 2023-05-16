
package claseanimal;


public class Animal {
    //Atributos
    String especie;
    char genero;
    int patas;
    boolean carnivoro;
    //Constructores
    Animal(){
        
    }
    Animal (String e){
        this.especie = e;
    }
    Animal (String e, char g, int p, boolean c){
        this.especie = e;
        this.genero = g;
        this.patas = p;
        this.carnivoro = c;
    }
    public void mostrarAnimal(){
        System.out.println("Especie: " + this.especie);
        System.out.println("Genero: " + this.genero);
        System.out.println("Patas: " + this.patas);
        System.out.println("¿Es carnivoro?" + this.carnivoro);
    }
}

