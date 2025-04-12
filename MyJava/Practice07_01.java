import java.util.Scanner;

public class Practice07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数を入力してください: ");
        double inputNum = sc.nextDouble();
        System.out.println("入力された値は " + inputNum + " です。");
        sc.close();
    }
}