import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("任意の数を入力してください > ");
        int inputNum = sc.nextInt();

; 
        System.out.println(inputNum + " を３で割ったあまりは " + (inputNum % 3) + " です");

        sc.close();
        }
   }