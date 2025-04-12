import java.util.Random;

public class Practice10_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(5) + 1;

        System.out.println("colorの値:" + color);

        switch (color) {
            case 1:
                System.out.println("今日のラッキーカラーは ピンク です");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("今日のラッキーカラーはレッド です");
                break;
            default:
                System.out.println("今日のラッキーカラーは ピンク です");
                break;

        }
    }
}