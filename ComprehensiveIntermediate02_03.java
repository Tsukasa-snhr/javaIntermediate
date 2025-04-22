import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        System.out.println("ゾロ目で大当たり！チャンスは30回");
        System.out.println("beginと入力してください入力してください");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (!input.equals("begin")) {
            System.out.println("開始できません");
            return;
        }
        Random rand = new Random();
        boolean hit = false;

        for (int i = 1; i <= 30; i++) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;
            int c = rand.nextInt(10) + 1;

            System.out.printf("%d回目：%d %d %d\n", i, a, b, c);

            if (a == b && b == c) {
                System.out.printf("%d回目で大当たりです。おめでとうございます！\n", i);
                hit = true;
                break;
            }
        }
        if (!hit) {
            System.out.println("残念でした。終わります。");
        }

        scanner.close();
    }
}
