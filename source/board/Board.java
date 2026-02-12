package source.board;

public class Board {
    private int squareCount;

    public Board(int squareCount){
        // @pre we assume squareCount > 0
        this.squareCount = squareCount;
    }

    public boolean isEndReached(int position){
        return position >= squareCount;
    }
}
