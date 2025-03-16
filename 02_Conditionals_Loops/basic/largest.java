// Find the Largest Number (Until User Enters 0)

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int largest = 0;
        do{
            System.out.print("Enter number: ");
            num = in.nextInt();
            if (num > largest){
                largest = num;
            }
        }
        while( num != 0);
        System.out.println("largest Number: "+ largest);
        in.close();
    }
}
