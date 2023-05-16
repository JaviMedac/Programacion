package parking;

public class Vehiculo {
    protected String color;
    protected int ruedas;
    
    public Vehiculo(String color, int ruedas){
        this.color = color;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", ruedas=" + ruedas + '}';
    }
    
}
