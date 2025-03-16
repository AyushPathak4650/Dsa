// Area & Perimeter of Circle

import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        final double PIE = 3.14;
        System.out.print("Enter Radius Of Circle: ");
        Scanner in  = new Scanner(System.in);
        float radius = in.nextFloat();
        in.close();
        System.out.println("Area = " + (PIE * (radius * radius)));
        System.out.printf("Perimeter = %.2f", (2 * PIE * radius));
    }
}