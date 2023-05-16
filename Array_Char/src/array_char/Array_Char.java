package array_char;
import java.util.Arrays;

public class Array_Char {

   
    public static void main(String[] args) {
        char array2 [] = {'A','C','B','a'};
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(array2);
        System.out.println(Arrays.binarySearch(array2, 'B'));
        String palabra = "HOLA";
        String palabra2 = "hola";
        System.out.println(palabra);
        System.out.println(palabra.length());
        System.out.println(palabra.charAt(0));
        System.out.println(palabra.indexOf('l'));
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.substring(0, 3));
        System.out.println(palabra2.equals(palabra));
        System.out.println(palabra.equalsIgnoreCase(palabra2));
        int a = 5342;
        String p = String.valueOf(a);
        System.out.println(p);
    }
    
}
