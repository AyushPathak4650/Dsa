// Sum of Numbers Until User Enters 0

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        do{
            System.out.print("Enter number: ");
            num = in.nextInt();
            sum += num;
        }
        while( num != 0);
        System.out.println("Sum: "+ sum);
        in.close();
    }
}
