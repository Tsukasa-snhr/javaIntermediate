import java.util.Random;

public class Practice08_02 {
    public static void main(String[] args){
        Random rand = new Random();
        int age = rand.nextInt(21);
        
       
        

        if (age >= 3) {
            System.out.println("あなたは baby です。");
        } else if (age > 3 && age< 18) {
            System.out.println("あなたは kid です。");
            } else {
                System.out.println("あなたは adult です。");
        }
    
  }
}