import java.util.Scanner; 

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("入場人数を入力してください: "); 
        int people = scanner.nextInt();

        int price;

        if (people >= 20) {
            price = 500;

        } else if (people >= 5) {
            price = 550;
        } else {
            price = 600;
        }
        
        int total = people * price;

        System.out.println("合計 " + total + " 円です。");

        scanner.close();
    }
}
        

    