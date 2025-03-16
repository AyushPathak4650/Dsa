// Volume of Cone, Cylinder & Sphere

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        final double PIE = 3.14; 
        Scanner in = new Scanner(System.in);
    
        System.out.print("For Cone \nRadius and Height: ");
        int radius = in.nextInt();
        int height = in.nextInt();
        System.out.println("Volume = " + ((1.0/3) * PIE * (radius * radius) * height));
    
        System.out.print("For Cylinder \nRadius and Height: ");
        radius = in.nextInt();
        height = in.nextInt();
        System.out.println("Volume = " + (PIE * radius * radius * height));
    
        System.out.print("For Sphere \nRadius: ");
        radius = in.nextInt();
        System.out.println("Volume = " + ((4.0/3) * PIE * (radius * radius * radius)));
        in.close();
    }
}
