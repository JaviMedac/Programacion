package main;

public class Mono extends LivingThing {

    public Mono(String name) {
        super(name);
    }

    @Override
    public void andar() {
        System.out.println(Mono.super.getName()  + " el mono camina con brazos y piernas");
    }

}
