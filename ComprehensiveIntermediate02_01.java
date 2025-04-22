import java.util.HashMap;
public class ComprehensiveIntermediate02_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("国語", 90);
        scores.put("数学", 80);
        scores.put("英語", 70);
        
        for (String kamoku : scores.keySet()) {
            Integer tensuu = scores.get(kamoku);
            System.out.println(kamoku + ":" + tensuu);

        }
    }
}
