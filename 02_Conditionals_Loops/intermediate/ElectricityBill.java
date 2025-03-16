// Electricity Bill Calculator

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = in.nextDouble();
        System.out.print("Enter rate per unit: ");
        double rate = in.nextDouble();

        double billAmount = units * rate;
        System.out.printf("Total Electricity Bill: %.2f\n", billAmount);

        in.close();
    }
}
