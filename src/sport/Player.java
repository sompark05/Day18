package sport;

public class Player {
    private int index;
    private String name;
    private int playerNum;

    public Player(int index, String name, int playerNum) {
        this.index = index;
        this.name = name;
        this.playerNum = playerNum;
    }

    public int getIndex() {
        return index;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public String getName() {
        return name;
    }
}
