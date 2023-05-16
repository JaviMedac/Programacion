package parking;


public class Coche extends Vehiculo{
    protected double velocidad;
    protected double cilindrada;
    
    public Coche(double velocidad, double cilindrada,String color, int ruedas){
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString(){
        return super.toString() + velocidad + cilindrada;
    }
}
