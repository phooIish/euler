public class euler4 {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                int num = i * j;
                if(isPalindrome(i,j)){
                    if(num > max){
                        max = num;
                    }
                }
            }
        }
        System.out.println(max);
    }

    static boolean isPalindrome(int x, int y){
        String num = Integer.toString(x * y);
        for(int i = 0; i < num.length() / 2; i++){ //You only need to check if the first half mirrors the second half.
            if(i == 0){
                if(num.charAt(0) == num.charAt(num.length()-1)){ //Is the first index equal to the last index?
                    continue;
                } else{
                    return false;}
            }
            //Compares second index with second to last index etc..
            if(num.charAt(i) != num.charAt(num.length()-1 - i)) {
                return false;
            }
        }
        return true;
    }
}
