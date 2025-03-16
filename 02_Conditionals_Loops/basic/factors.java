// Find All Factors of a Number

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        System.out.print("Factors: ");
        for(int i = 1; i <= num/2; i++){
            if ((num % i) == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(num);
    }
}
