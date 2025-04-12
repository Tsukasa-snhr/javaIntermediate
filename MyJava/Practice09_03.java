import java.util.Random;

  public class Practice09_03 {
    public static void main(String[] args) {
         Random rand = new Random();

         for(int i= 1; i <= 10; i++) {
             int num = rand.nextInt(6) + 1;

             if(num % 2 != 0) {
                System.out.println(i + "回目," + num + "が出ました" );

    }
   }
  }
}
