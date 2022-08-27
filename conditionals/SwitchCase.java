public class SwitchCase {
    
    public static void main(String[] args){
        int number = 85;

        switch (number) {
            case 1:
                System.out.println("case one");
                break;
            case 85:
                System.out.println(number);
                break;
            default:
                System.out.println("no case matches");
                break;
        }
    }
}
