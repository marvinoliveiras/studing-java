public class Arrays{
    public static void main(String[] args){
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 3;
        num[2] = 5;
        num[3] = 8;
        num[4] = 10;
        System.out.printf("%d\n", num[0]);
        int[] numbers = {1,3,20,8,7};
        System.out.println(numbers[4]);
        System.out.println("\nexecuting a loop 'For' on the array 'num':");
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("\nexecuting a loop 'For' on the array 'numbers':");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        char[] answerSheet = {'a', 'b', 'c', 'c', 'b'};

        char[] answers = {'a', 'c', 'b', 'a', 'b'};

        int score = 0;

        for(int i = 0;i < answerSheet.length; i++){
            System.out.println("Yout answer: "+answers[i]+" correct answer: "+answerSheet[i]);
            if(answerSheet[i] == answers[i]){
                score++;
            }
        }
        System.out.print("Your final score is: "+score);

        int[] num2 = {1, 3, 5, 7, 8, 10};
        for(int n:num2){
            System.out.println(n);
        }
    }
}