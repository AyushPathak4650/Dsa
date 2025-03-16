// Discount Calculation
import java.util.Scanner;
public class DiscountCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Original Price: ");
        double original = in.nextDouble();
        System.out.print("Enter Discount%: ");
        double dis = in.nextDouble();
        double discount = original * dis / 100;
        System.out.println("Discounted Price: " + (original - discount));
        in.close();
    }
}
