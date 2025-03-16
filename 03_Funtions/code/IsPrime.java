// Check if a number is prime.
public class IsPrime {
    public static void main(String[] args) {
        System.out.println(prime(1));
        System.out.println(prime(2));
        System.out.println(prime(17));
        System.out.println(prime(20));
        System.out.println(prime(28));
        System.out.println(prime(1234));
    }

    static boolean prime(int x){
        for (int i = 2; i <= (int) Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
