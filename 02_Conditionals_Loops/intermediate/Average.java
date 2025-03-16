// Average of N Numbers (till user enters 0)

import java.util.Scanner;

public class Average{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        int sum = 0;
        int N = 0;
        while( num != 0){
            N++;
            sum += num;
            System.out.print("Enter number: ");
            num = in.nextInt();
            
        }
        System.out.println("Average: "+ sum/N);
        in.close();
    }
}
