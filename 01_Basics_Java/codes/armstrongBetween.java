// To find Armstrong Number between two given number.
import java.util.Scanner;

public class armstrongBetween {
    public static void main(String[] args) {
        System.out.print("Enter Range: ");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        int num;
        int sum = 0;
        System.out.print("Armstrong Numbers: ");
        while(start < end){
            
            num = start;
            while (num > 0){
                sum += (num % 10)*(num % 10)*(num % 10);
                num /= 10;  
            }
            if ((int) sum == start){
                System.out.print(start + " ");
            }
            sum = 0;
            start++;
        }
        

    }
}
