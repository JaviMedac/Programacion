package main;

public class Human extends LivingThing {

    public Human(String name) {
        super(name);
    }

    @Override
    public void andar() {
        System.out.println(Human.super.getName() + " está andando con las 2 piernas");
    }

}
