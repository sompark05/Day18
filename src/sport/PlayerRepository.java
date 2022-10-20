package sport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerRepository {
    HashMap<Integer, Player> db;

    public PlayerRepository() {
        db = new HashMap<>();
    }
    void save(Player p) {
        db.put(p.getIndex(), p);
        System.out.println("저장 완료!");
    }
    List<String> findAll() {
        List<String> result = new ArrayList<>();

        for(HashMap.Entry<Integer, Player> entry : db.entrySet()) {
            //System.out.println(entry.getKey());
            result.add(entry.getValue().getName() + " " + entry.getValue().getPlayerNum());
        }
        return result;
    }

    String findByIndex(int index) {
        if(db.containsKey(index)) {
            Player targetPlayer = db.get(index);
            return targetPlayer.getName() + " " + targetPlayer.getPlayerNum();
        } else {
            return "index에 해당하는 선수가 없습니다.";
        }

    }
}
