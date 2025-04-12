import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int gender = rand.nextInt(2);
        int gender = 0;

        if (gender == 1) {
            System.out.println("あなたは 女 です。");
        } else {
            System.out.println("あなたは 男 です");
        }
    }

}
