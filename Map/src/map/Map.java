package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap();
        m.put("Color", "rojo");
        m.put("Ancho", "640");
        m.put("Alto", "320");
        m.put("Color", "negro");
        System.out.println(m);
        //m.remove("Color");
        System.out.println(m);
        System.out.println(m.get("Ancho"));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        //m.clear();
        System.out.println(m);
        ArrayList<String> lista = new ArrayList(m.values());
        System.out.println(lista);
        Iterator it = m.keySet().iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            System.out.println(key + m.get(key));
        }
        System.out.println(m);
        TreeMap<String,String> t = new TreeMap();
        t.put("Color", "Rojo");
        t.put("Ancho", "640");
        t.put("Alto", "320");
        System.out.println(t);
        
        LinkedHashMap<String,String> l = new LinkedHashMap();
        l.put("Color", "Rojo");
        l.put("Ancho", "640");
        l.put("Alto", "320");
        System.out.println(l);
        
        
    }

}
