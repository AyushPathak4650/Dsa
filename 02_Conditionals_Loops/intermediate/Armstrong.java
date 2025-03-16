// Armstrong Number Check

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner in  = new Scanner(System.in);

        int sum = 0;
        int n = in.nextInt();
        in.close();
        int num = n;
        while (num > 0){
            sum += (num % 10)*(num % 10)*(num % 10);
            num /= 10;  
        }
        if ((int) sum == n){
            System.out.print("Armstrong");
        } else{
            System.out.print("NOT Armstrong");
        }
    }
}
