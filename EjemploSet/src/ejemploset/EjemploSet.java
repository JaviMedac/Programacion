package ejemploset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EjemploSet {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Pablo");
        set1.add("Pablo");
        set1.add("Elena");
        set1.add("Irene");
        System.out.println(set1);
        Iterator<String> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        HashSet<Integer> set2 = new HashSet();
        set2.add(2);
        set2.add(7);
        set2.add(3);
        set2.add(4);

        System.out.println(set2);

        HashSet<Persona> set3 = new HashSet();
        set3.add(new Persona("Pepe", "77", 54));
        set3.add(new Persona("Antonio", "88", 36));
        set3.add(new Persona("Juan", "111", 18));
        set3.add(new Persona("Juan", "111", 18));

        // System.out.println(set3);
        TreeSet<String> tree1 = new TreeSet();
        tree1.add("Pepe");
        tree1.add("Antonio");
        tree1.add("Juan");
        tree1.add("Elena");
        tree1.add("Maria");
        // System.out.println(tree1);

        TreeSet<Persona> tree2 = new TreeSet();
        tree2.add(new Persona("Pepe", "77", 54));
        tree2.add(new Persona("Antonio", "88", 36));
        tree2.add(new Persona("Juan", "111", 18));
        tree2.add(new Persona("Zack", "111", 18));
        tree2.add(new Persona("Bob", "111", 18));
        

        System.out.println(tree2);
    }

}
