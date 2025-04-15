public class Practice13_01 {
    public static void main(String[] args) {
        Animal pochi = new Animal();
        pochi.name = "pochi";
        pochi.type = "dog";
        System.out.println(pochi.name);
        pochi.cryAnimals() ;

        Animal tama = new Animal();
        tama.name = "tama";
        tama.type = "cat";
        System.out.println(tama.name);
        tama.cryAnimals() ;
    }       
}

class Animal {
    String name = "Jhon";
    String type = "nothing";

    public void cryAnimals() {
        System.out.println(
            switch (type) {
                case "cat" -> "nya-";
                case "dog" -> "wan";
                default -> "特定できませんでした";
                }
            );
        }
    }
    
