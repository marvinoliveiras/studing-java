import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args){
        final int tam=10;
        int[] num={9,2,5,8,7,13,22,0, 7, 10};
        int[] numbers= new int[tam];

        Arrays.fill(numbers, 10);
        Arrays.sort(num);

        System.arraycopy(num, 0, numbers, 0, tam);
        for(int n:numbers){
            System.out.printf("%d - ", n);
        }

        System.out.println((Arrays.equals(num, numbers)) ? "equals": "different");

    }
}
