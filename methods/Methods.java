public class Methods {
    public static void main(String[] args){
        System.out.println(sum(10, 20, 30, 10));
        System.out.println(sum(1.5, 2.3,3.1,10.8));
    }

    public static int sum(int... numbers){
        int result = 0;
        for(int n:numbers){
            result += n;
        }
        return result;
    }
    public static double sum(Double... numbers){
        int result = 0;
        for(double n:numbers){
            result += n;
        }
        return result;
    }
}
