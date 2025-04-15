import java.util.Random;
public class Practice14_02 {
    public static void main(String[] args) {

        try {
            Random rand = new Random();
            int x = rand.nextInt(2);
            if (x == 0) {
                int result = 0 / 0;
            } else {
                String y = null;
                y.length();
            }

        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }

        System.out.println("処理終了");
    }
}
    
