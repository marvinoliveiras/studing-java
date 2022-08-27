import java.security.SecureRandom;

public class Matrix {
    public static void main(String[] args){
        final int rows = 3;
        final int columns = 5;
        int[][] numbers = new int[rows][columns];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                numbers[r][c] = new SecureRandom().nextInt(100);
            }
        }
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                System.out.printf("%2d | ", numbers[r][c]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");

        for(int[] n:numbers){
            for(int v:n){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("%n");
        }

        int[][] numbers2 = {{10,20,30,40,50}, {1,2,3,4,5},{100,200,300,400,500}};

        System.out.printf("%n");

        for(int[] n:numbers2){
            for(int v:n){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("%n");
        }
    }
}