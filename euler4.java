public class euler4 {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                int num = i * j;
                if(isPalindrome(i,j)){
                    if(num > max){
                        max = num; //If the product is a palindrome and is greater than the current max, current num is set to the new max.
                    }
                }
            }
        }
        System.out.println(max);
    }
    static boolean isPalindrome(int x, int y){
        String temp = Integer.toString(x * y);
        char[] array = new char[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            array[i] = temp.charAt(i);
        }
        for(int i = 0; i < array.length / 2; i++){
            if(i == 0){
                if(array[0] == array[array.length-1]){ //Is the first index equal to the last index?
                    continue;
                } else{
                    return false;}
            }
            //Compares second index with second to last index etc..
            if(array[i] == array[array.length-i - 1]) {}
            else{return false;}
        }
        return true;
    }
}
