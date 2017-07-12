public class euler6 {
    public static void main(String[] args) {
        int sq_sum = (int)Math.pow(squareOfsum(100),2);
        int ans = sq_sum - sumOfsquares(100);
        System.out.println(ans);
    }
    static int squareOfsum(int x){
        if(x == 1){
            return 1;
        }
        return x + squareOfsum(x - 1);
    }
    static int sumOfsquares(int y){
        if(y == 1){
            return 1;
        }
        return (y*y) + sumOfsquares(y - 1);
    }
}
