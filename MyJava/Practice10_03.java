import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        System.out.println("年齢は:" + age);
    
        if (gender == 0) {
            System.out.println("性別は: 男");
        } else {
            System.out.println("性別は: 女");
        }
        

        switch (age) {
            case 0, 1, 2, 3:
                if(gender == 0) {
                     System.out.println("あなたは baby な男 です");
            } else {
                System.out.println("あなたは babyな女 です");
            }
                break;

            case 4, 5:
            if(gender == 0) { 
                System.out.println("あなたは kid な男 です");
            } else {
                System.out.println("あなたは kid な女 です");
            }
            break;

            case 6, 7, 8, 9, 10, 11, 12, 13,
            14, 15, 16, 17:
           if (gender == 0) {
               System.out.println("あなたは kidな男 です");
            } else {
                System.out.println("あなたは kidな女 です");
            }
           break;

            default:
            if (gender == 0) {
                System.out.println("あなたは sdult な男です");
                } else {
                    System.out.println("あなたは sdult な女です");
                }
                break;
        }
    }
}