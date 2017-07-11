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
        String str = Integer.toString(x * y);
        char[] array = str.toCharArray(); //Convert String to char[]
        for(int i = 0; i < array.length / 2; i++){
            if(i == 0){
                if(array[0] != array[array.length-1]) {return false;} //Is the first index equal to the last index?
            }
            //Compares second index with second to last index etc..
            if(array[i] != array[array.length-i - 1]) {return false;}
        }
        return true;
    }
}
