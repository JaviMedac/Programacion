
package ordenar_arrays;
import java.util.Arrays;

public class Ordenar_Arrays {


    public static void main(String[] args) {
       int Array[] = {5,7,2,3,4,1,6};
        for(int i = 0; i < Array.length;i++){
            System.out.print(Array[i]);           
            }
        Arrays.sort(Array);
        System.out.println(" ");
        for (int j = 0; j < Array.length;j++){
            System.out.print(Array[j]);           
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(Array, 3));
        System.out.println("");
        }
    }
    

