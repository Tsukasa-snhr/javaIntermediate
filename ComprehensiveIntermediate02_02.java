import java.util.*;

 class MenuManager {
    Map<String, ArrayList<String>> himo = new HashMap<>();

    MenuManager() {
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        himo.put("sandwitch", list);
        
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        himo.put("drink", list);
        
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        himo.put("sidemenu", list);
    }

    public void showMenu(String category) {
        System.out.println(himo.get(category));
    }

    public void setMenu(String category, String menu) {
        ArrayList<String> list = himo.get(category);
        if (list != null) {
            list.add(menu);
        } else {
            System.out.println("そのカテゴリーは存在しません。");
        }
    }

    public void searchMenu(String menu) {
        for (String category : himo.keySet()) {
            ArrayList<String> list = himo.get(category);
            if (list.contains(menu)) {
                System.out.println(menu + " は " + category + " に含まれています。");
                return;
            }
        }
        System.out.println("該当するメニューはありません。");
    }
}

class ComprehensiveIntermediate02_02 {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager(); 
    
        manager.showMenu("sandwitch");                  
        manager.setMenu("sandwitch", "ビッグバーガー"); 
        manager.showMenu("sandwitch");                  
        manager.searchMenu("ホットミルク");             
        manager.searchMenu("オレンジジュース");        
    }
}
