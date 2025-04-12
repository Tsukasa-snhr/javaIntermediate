import java.util.Scanner;
  public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];



        System.out.println("1つ目の数字を入力してください : ");
         array[0] = sc.nextInt();

        System.out.println("2つ目の数字を入力してください : ");
         array[1] = sc.nextInt();

        System.out.println("3つ目の数字を入力してください : ");
         array[2] = sc.nextInt();

    

        System.out.println("1番目の要素の値は " + array[0] + " で、2倍にすると " + (array[0] * 2) + " になり、3 で割ったあまりは " + (array[0] % 3) + " です");
        System.out.println("2番目の要素の値は " + array[1] + " で、2倍にすると " + (array[1] * 2) + " になり、3 で割ったあまりは " + (array[1] % 3) + " です");
        System.out.println("3番目の要素の値は " + array[2] + " で、2倍にすると " + (array[2] * 2) + " になり、3 で割ったあまりは " + (array[2] % 3) + " です");



        
        sc.close();

    }
}