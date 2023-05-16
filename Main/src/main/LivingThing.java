package main;

abstract public class LivingThing {

    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public void respirar() {
        System.out.println("Respiro");
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    abstract public void andar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
