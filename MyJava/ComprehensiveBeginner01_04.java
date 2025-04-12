
class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        System.out.print("何段>");
        int inputNum = new java.util.Scanner(System.in).nextInt();
        
        if (inputNum < 1 || inputNum > 5) {
            System.out.println("１～５までの整数を入力してください");
            return;
            }

        for (int i = 1; i <= inputNum; i++) {

            for (int j = 1; j <= inputNum - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}