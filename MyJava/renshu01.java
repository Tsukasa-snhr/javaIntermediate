import java.util.Scanner;

public class renshu01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("1番目の値を入力せよ");
        array[0] = scanner.nextInt();

        System.out.println("2番目の値を入力せよ");
        array[1] = scanner.nextInt();

        System.out.println("3番目の値を入力せよ");
        array[2] = scanner.nextInt();
        System.out.println("1番目の要素の値は " + array[0] + "二倍すると " + (array[0] * 2) + "、 3で割った余りは" + (array[0] % 3) + "です");
        System.out.println("2番目の要素の値は " + array[1] + "二倍すると " + (array[1] * 2) + "、 3で割った余りは" + (array[1] % 3) + "です");
        System.out.println("3番目の要素の値は " + array[2] + "二倍すると " + (array[2] * 2) + "、 3で割った余りは" + (array[2] % 3) + "です");
        scanner.close();
    }
}
