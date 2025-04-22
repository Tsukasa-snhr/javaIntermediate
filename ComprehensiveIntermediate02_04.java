import java.util.Scanner;

public class ComprehensiveIntermediate02_04 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Hand;

        while (true) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2:パー ＞数字を入力してください：");
            Hand = scanner.nextInt();

            if(Hand < 0 || Hand > 2) {
                System.out.println("エラーです。０～２の数字を入力し直してください");
                continue;
            }

            int NPC = new java.util.Random().nextInt(3);
            String[] hands = {"グー", "チョキ", "パー"};


            System.out.println("あなた：" + hands[Hand]);
            System.out.println("相手：" + hands[NPC]);

            if (Hand == NPC) {
                System.out.println("あいこ");
            } else if ((Hand == 0 && NPC == 1) ||
                     (Hand == 1 && NPC == 2) ||
                     (Hand == 2 && NPC == 0)) {
                System.out.println("あなたの勝ち");
            } else {
                System.out.println("あなたの負け...");
            }

            break;
        }
    }
}

