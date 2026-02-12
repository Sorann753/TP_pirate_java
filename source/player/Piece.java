package source.player;

public class Piece {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void move(int dist) {
        this.position += dist;
    }
}