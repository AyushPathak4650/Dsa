// Find all prime numbers between two numbers.
public class PrimeBetween {
    public static void main(String[] args) {
        System.out.println(countPrime(0,10));
        System.out.println(countPrime(10,25));
        System.out.println(countPrime(25,60));
        System.out.println(countPrime(60,100));
    }
    static String countPrime(int s,int e){
        String primes = "";
        boolean toAdd = true;
        for (int j = s; j <= e; j++){
            toAdd = true;
            for (int i = 2; i <= (int) Math.sqrt(j); i++){
                if (j % i == 0){
                    toAdd = false;
                }
            }
            if(toAdd){
                primes += String.format("%d ", j);
            }
            
        }
        return primes;
    }
    
}
