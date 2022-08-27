import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Number n2 = new Number();
        Number result = new Number();
        Number n1 = new Number();
        String option = "y";
        while(option.equals("y") || option.equals("Y")){
            System.out.println("Enter a number:");
            n1.setValue(scan.nextInt());
            System.out.println("Enter another number:");
            n2.setValue(scan.nextInt());
            result.setValue(n1.getValue()+n2.getValue());
            System.out.printf(
                "The sum of %d and %d is equal to: %d%n",
                n1.getValue(), n2.getValue(), result.getValue()
            );
            System.out.println("Do you want to sum another values?");
            option = scan.next();
        }
        scan.close();
    }

}