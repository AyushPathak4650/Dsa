// Surface Area of Cube & Cylinder

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        final double PIE = 3.14; 
        Scanner in = new Scanner(System.in);

        System.out.print("For Cube \nLength of Side: ");
        int side = in.nextInt();
        System.out.println("Surface Area = " + 6 * side * side);
    
        System.out.print("For Cylinder \nRadius and Height: ");
        int radius = in.nextInt();
        int height = in.nextInt();
        System.out.println("Volume = " + ((2 * PIE * radius * radius)+(2 * PIE * radius * height)) );
        in.close();
    }
}
