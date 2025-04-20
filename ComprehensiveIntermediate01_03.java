import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("係数aを入力してください :");
        double a = scanner.nextDouble();

        System.out.print("係数bを入力してください :");
        double b = scanner.nextDouble();

        System.out.print("係数cを入力してください :");
        double c = scanner.nextDouble();


        double hanbetu = b * b - 4 * a * c;


            if (hanbetu > 0) {
                System.out.println("2つの実数解があります。");
            } else if (hanbetu == 0) {
                System.out.println("重解です。");
            } else {
                System.out.println("2つの虚数解があります。");
            }
    
            scanner.close();
        }
    }