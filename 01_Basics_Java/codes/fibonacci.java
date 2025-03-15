// To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int t1 = 0;
        int t2 = 1;
        int sum;
        System.out.println("Series: ");
        System.out.println(t1);
        System.out.println(t2);
        for(int i = 1; i < N-1; i++){
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            System.out.println(sum);
        }
        in.close();
    }
}
