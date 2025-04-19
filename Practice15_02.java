import java.util.TreeSet;

public class Practice15_02 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("kubo");
        set.add("mitoma");
        set.add("kamada");
        set.add("kamada");

        for (String name : set ) {
            System.out.println(name);
        }
    }

}
