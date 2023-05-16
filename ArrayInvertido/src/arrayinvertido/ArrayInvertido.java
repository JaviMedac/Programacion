package arrayinvertido;
import java.util.Arrays;
public class ArrayInvertido {

    
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = {3,5,3,5,2};
        for (int i=4; i>=0;i--){
            System.out.print(array1[i]);
            
           } 
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.equals(array1,array2));
        System.out.println("");
    }
}
