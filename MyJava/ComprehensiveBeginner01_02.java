import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] nums = new int[10];
        int sum = 0;
        int count = 0;

        int num;
        while (sum <= 100 && count < 10) {
            num = rand.nextInt(100) + 1;
            nums[count] = num;
            sum = sum + num;
            count = count + 1;
        }
        System.out.println("合計=" + sum);
        System.out.println("入力された数値=");
        for (int i = 0; i < count; i++) {
            System.out.println( nums[i]);

        }

    }
}
