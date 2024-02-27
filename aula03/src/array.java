import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {
        int [] arrayA = {43,7,5,2,8,75,3,87,2,76};

        Arrays.sort(arrayA);

        for(int i=0; i < arrayA.length; i++){
            System.out.println(arrayA[i]);
        }
    }
}
