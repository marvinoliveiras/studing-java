import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int count = 0;count < 4; count++){
            System.out.println(count+" My course!");
        }

        int count = 0;
        int max = scan.nextInt();
        while(count < max){
            System.out.println("using the loop while, while the counter is < "+max+", in that moment, the counter is equal: "+count);
            count++;
        }
        count = 0;
        do{
            if(count == 0){
                System.out.println("The first execution for doWhile, before de test 'while'");
            }else{
                System.out.println("the "+count+" execution of the loop doWhile");
            }
            count++;
        }while(count < max);
    }
}