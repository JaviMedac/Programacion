package funciones;


public class Funciones {

  
    public static void main(String[] args) {
       int a = 4, b = 6, c = 7;
       int resultado1 = mayor(a,b);
       int resultado2 = mayor(resultado1,c);
       System.out.println(resultado2);
       
    }
 public static int mayor(int num1,int num2){
     int res;
     if (num1 > num2){
         res = num1;
     }
     else {
         res = num2;
     }
     return res;
 }
 }
