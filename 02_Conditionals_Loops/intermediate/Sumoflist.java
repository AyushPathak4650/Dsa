// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Sumoflist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int negative = 0;
        int pos_even = 0;
        int pos_odd = 0;

        System.out.print("Enter Number: ");
        int num = in.nextInt();

        while (num != 0){
            if (num < 0){
                negative += num;
            } else if (num % 2 == 0){
                pos_even += num;
            } else{
                pos_odd += num;
            }
            System.out.print("Enter Number: ");
            num = in.nextInt();
        }
        in.close();

        System.out.println("Sum of Negative Numbers = " + negative);
        System.out.println("Sum of Positive Even Numbers = " + pos_even);
        System.out.println("Sum of Positive Odd Numbers = " + pos_odd);
    }   
}
