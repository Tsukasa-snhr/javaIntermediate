public class Practice14_01 {
    public static void main(String[] args) {
        try {
            String Happa = null;
            System.out.println(Happa.length());
        } catch (NullPointerException M) {
                System.out.println("ぬるぽをキャッチしました");
        } finally {
                System.out.println("finally ブロックです");
        }
        System.out.println("処理終了");
    }
}
