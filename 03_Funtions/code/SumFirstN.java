// Find the sum of the first n natural numbers.

public class SumFirstN {
    public static void main(String[] args) {
        System.out.println(SumN(5));
        System.out.println(SumN(20));
        System.out.println(SumN(50));
        System.out.println(SumN(1000));
    }

    static int SumN(int N){
        int sum = 0;
        for (int i = 1; i <= N; i++){
            sum += i;
        }
        return sum;
    }
}
