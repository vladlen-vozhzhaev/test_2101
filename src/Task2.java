import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 70");
        int n = scanner.nextInt();
        int[][] nums = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(0, n+70);
            }
        }
        String result = "Числа "+n+" в данном массиве нет";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(n == nums[i][j]){
                    result = "Число найдено на позиции: ["+i+"]["+j+"]";
                }
            }
        }
        System.out.println(result);
        for (int[] num:nums) {
            System.out.println(Arrays.toString(num));
        }
    }
}
