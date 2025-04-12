import java.util.Random;
public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random rand = new Random();
            
        int man = rand.nextInt(3)+1;
        int woman = rand.nextInt(3)+1;
        int child = rand.nextInt(3)+1;

        System.out.println("man: " + man );
        System.out.println("woman: " + woman );
        System.out.println("child: " + child );


        if((man == woman && woman == child) || (man != woman && woman != child && man != child)) {
            System.out.println("あいこです");
        } else {
                boolean Mwin = isStronger(man, woman) && isStronger(man, child);
                boolean Wwin = isStronger(woman, man) && isStronger(woman, child);
                boolean Cwin = isStronger(child, woman) && isStronger(child, man);

                if (Mwin && Wwin) {
                    System.out.println("man と woman が勝ちました");
                } else if (Mwin && Cwin) {
                    System.out.println("man と child が勝ちました");
                } else if (Wwin && Cwin) {
                    System.out.println("woman と child が勝ちました");

                } else if (Mwin) {
                    System.out.println("man が勝ちました");
                } else if (Wwin) {
                    System.out.println("woman が勝ちました");
                } else if (Cwin) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("あいこです");
            }
        }
    }
           public static boolean isStronger(int a, int b) {
            return (a == 3 && b == 2) || (a == 2 && b == 1) || (a == 1 && b == 3);
    }
}
    



