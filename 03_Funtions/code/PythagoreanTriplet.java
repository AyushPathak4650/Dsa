// Check if a triplet is a Pythagorean triplet.
public class PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println(Triplet(3,4,5));
        System.out.println(Triplet(13,24,55));
        System.out.println(Triplet(8,15,17));
        System.out.println(Triplet(5,12,13));
    }

    static String Triplet(int x,int y, int z){
        if ((x*x) + (y*y) == (z*z)){
            return String.format("Pythagorean triplet: %d %d %d", x, y, z);
        }
        return String.format("NOT a pythagorean triplet: %d %d %d", x, y, z);
    }
}
