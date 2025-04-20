import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください :"); 
        int a = scanner.nextInt();

        System.out.print("2つ目の整数を入力してください：");
        int b = scanner.nextInt();

        System.out.print("3つ目の整数を入力してください：");
        int c = scanner.nextInt();


        if (a <= b && b <= c) {
            System.out.println("OK");
        } else {
            System.out.println("NG"); 
        }

        scanner.close();
    }
}
