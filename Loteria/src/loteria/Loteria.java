package loteria;
import java.util.Arrays;
import java.util.Scanner;


public class Loteria {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int loteria2021[] = {8,6,1,4,8};
       int loteria2020[] = {7,2,8,9,7};
       int loteria2019[] = {2,6,5,9,0};
       int loteria2018[] = {0,3,3,4,7};
       int loteria2017[] = {7,1,1,9,8};
       int loteria2016[] = {6,6,5,1,3};
       int loteria2015[] = {7,9,1,4,0};
       int loteria2014[] = {1,3,4,3,7};
       int loteria2013[] = {6,2,2,4,6};
       int loteria2012[] = {7,6,0,5,8};
       int loteria2011[] = {5,8,2,6,8};
       int contador[] = new int[10];
       int resultado[] = new int[5];
       Arrays.fill(contador, 0);
       for (int i = 0; i<loteria2021.length;i++){
           contador[loteria2021[i]]++;
           contador[loteria2020[i]]++;
           contador[loteria2019[i]]++;
           contador[loteria2018[i]]++;
           contador[loteria2017[i]]++;
           contador[loteria2016[i]]++;
           contador[loteria2015[i]]++;
           contador[loteria2014[i]]++;
           contador[loteria2013[i]]++;
           contador[loteria2012[i]]++;
           contador[loteria2011[i]]++;
           Arrays.fill(contador,0);
           int indice = 0;
           
       for (int x=0; x>contador.length;x++){
       int mayor = 0;
        if (mayor<contador[x]){
            mayor = contador[x];
            indice = x;
        }
       }
       resultado[i] = indice;
       }
       
              

    }
    
}
