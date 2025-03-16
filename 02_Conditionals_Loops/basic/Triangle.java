// Area & Perimeter of Triangle
import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {

        System.out.print("Enter Length: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.printf("Area: %.2f\n", (Math.sqrt(3)/4)*(a*a));
        System.out.println("Perimeter : " + (3*a));

        in.close();
    }
}