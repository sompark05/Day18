package sport;

import java.util.List;

public class PlayerController {
    PlayerRepository pr;

    public PlayerController(PlayerRepository pr) {
        this.pr = pr;
    }

    void scout() {
        pr.save(new Player(1, "손흥민", 7));
        pr.save(new Player(2, "이강인", 11));
    }
    void info() {
        List<String> result = pr.findAll();

        for(String s : result) {
            System.out.println(s);
        }
    }

    void infoByIndex(int index) {
        System.out.println(pr.findByIndex(index));
    }
}
