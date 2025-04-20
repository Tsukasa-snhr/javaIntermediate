import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("整数値を入力してください:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}
    

