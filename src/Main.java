import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        System.out.println(Arrays.deepToString(nums));
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(0, 250);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2 == 0 && nums[i][j] > 100){
                    nums[i][j] = 0;
                }
            }
        }
        for (int[] num:nums) {
            System.out.println(Arrays.toString(num));
        }
    }
}