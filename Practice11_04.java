import java.util.Scanner;

class Practice11_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        while(inputNum > 5 || inputNum < 1) {
            System.out.print("何段>");
            inputNum = scanner.nextInt();
        
            if (inputNum < 1 || inputNum > 5) {
                System.out.println("１～５までの整数を入力してください");
                return;
            }
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