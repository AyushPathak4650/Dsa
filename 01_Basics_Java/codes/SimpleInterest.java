// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest{
    public static void main( String args[]){
        System.out.println("Enter P, R, T: ");
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        float R = in.nextFloat();
        int T = in.nextInt();
        System.out.println((P*R*T)/100);
        in.close();
    }
}