public class euler3 {
    public static void main(String[] args) {
        //APPEND AN 'L' TO TELL COMPILER IT IS A LONG LITERAL!
        for(int i=1;i <= 600851475143L;i++){
            if(isPrime(i) && 600851475143L % i == 0){
                System.out.println(i + " is prime");
            }
        }
    }
    static boolean isPrime(long n){
        if(n == 1){
            return false;
        }
        for(int i=2;i <= (long) Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
