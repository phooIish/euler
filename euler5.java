public class euler5 {
    public static void main(String[] args) {
        for(int i = 2520; i < 900000000; i++){ //1-10 = 2520
            int j = 11; //We only need to check 11-20 since were starting from the smallest number divisible by 1-10.
            while(i % j == 0){
                j++;
                if(j > 20){
                    break;
                }
            }
            if(j > 20){//Once the first number is found, the for loop finishes.
                System.out.println(i);
                break;
            }
        }
    }

}
