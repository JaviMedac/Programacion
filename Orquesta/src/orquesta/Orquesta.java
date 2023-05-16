package orquesta;


public class Orquesta {

    
    public static void main(String[] args) {
        Piano piano1 = new Piano();
        Guitarra guitarra1 = new Guitarra();
        piano1.addNota(Piano.notas.DO);
        piano1.addNota(Piano.notas.MI);
        guitarra1.addNota(Guitarra.notas.SOL);
        piano1.interpretar();
        guitarra1.interpretar();
        
    }
    
}