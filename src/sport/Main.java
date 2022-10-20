package sport;

public class Main {
    public static void main(String[] args) {
        PlayerRepository pr = new PlayerRepository();
        PlayerController pc = new PlayerController(pr);
        pc.scout();
        pc.info();
        pc.infoByIndex(3);
    }
}