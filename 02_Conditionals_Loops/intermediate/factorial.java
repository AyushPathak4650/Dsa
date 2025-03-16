// Factorial Calculation

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int product = 1;
        for (int i = 0; i < num-1; i++){
            product *= (num - i);
            
        }
        System.out.println(product);
    }
}