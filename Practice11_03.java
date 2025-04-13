import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 1;

        while (count <= 10) {
            int num = rand.nextInt(6) + 1;

            if (num % 2 == 1) {
                System.out.println(count + "回目、" + num + "が出ました");
            }

            count++;
        }
    }
}
