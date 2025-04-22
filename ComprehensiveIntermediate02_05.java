public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
     
        Juice juice1 = new Juice("バヤリース", "オレンジ", 130);
        juice1.buyDrink();

        Juice juice2 = new Juice("午後の紅茶", "レモンティー", 150);
        juice2.buyDrink();

        
        Coffee coffee1 = new Coffee("ボス", "控え目", false, 110);
        coffee1.buyDrink();

        Coffee coffee2 = new Coffee("ジョージア", "甘め", true, 120);
        coffee2.buyDrink();
    }
}


class Juice {
    private String brand; 
    private String flavor; 
    private int price; 


    public Juice(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }


    public void buyDrink() {
        System.out.println(brand + " の " + flavor + " 味です。" + price + " 円になります。");
    }
}


class Coffee {
    private String brand; 
    private String sweetness; 
    private boolean hasMilk; 
    private int price;

   
    public Coffee(String brand, String sweetness, boolean hasMilk, int price) {
        this.brand = brand;
        this.sweetness = sweetness;
        this.hasMilk = hasMilk;
        this.price = price;
    }

   
    public void buyDrink() {
        String milk = hasMilk ? "ミルク 入り" : "ミルク 無し";
        System.out.println(brand + " の甘さは " + sweetness + "、" + milk + "です。 " + price + " 円になります。");
    }
}
