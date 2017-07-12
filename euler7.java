public class euler7 {
    public static void main(String[] args) {
        int count = 0;
        for(int j = 2; j < 200000; j ++){
            if(isPrime(j)){
                count++;
            }
            if(count > 10000){
                System.out.println("ans = "+ j +", count = " + count);
                break;
            }
        }
    }
    static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
