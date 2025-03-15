// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class largest2 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();

        if (num1 > num2){
            System.out.println(num1);
        } else{
            System.out.println(num2);
        }
        in.close();
    }
}
