import java.util.Scanner;

public class DataScanner{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1=0, n2 = 0, res = 0;
        String name = "";

        System.out.print("type your name:");
        name = scan.nextLine();

        System.out.println("Type a number:");
        n1 = scan.nextInt();

        System.out.println("Type another number:");
        n2 = scan.nextInt();

        res= n1 + n2;

        System.out.printf("%s, Adding %d and %d is equal to %d",name, n1, n2, res);
    }
}