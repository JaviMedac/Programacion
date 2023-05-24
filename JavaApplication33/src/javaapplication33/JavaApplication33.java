/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <String> lita = new ArrayList<>();
        ArrayList <Integer> lista = new ArrayList<>();
        LinkedList <Integer> lista2 = new LinkedList<>();
        lista2.add(2);
        lista2.add(2);
        Set<Integer> lista3  = new TreeSet<>();
        lista3.add(3);
        lista3.add(4);
        System.out.println(lista3);
    }
    
}
