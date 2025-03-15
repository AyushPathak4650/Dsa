// Input currency in rupees and output in USD.
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        System.out.print("Enter Amount: ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        System.out.print((amount * 0.012) + " USD");
        in.close();
    }
}
