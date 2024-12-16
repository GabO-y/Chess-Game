import java.util.List;

public class Piece {

    protected Type type;
    protected int color;
    protected boolean firstPlay = true;

    public Piece(Type type, int color) {
        this.type = type;
        this.color = color;
    }

    public List<int[]> play(Chessboard cb, int[] pos) {
        return null;
    }

    public Type getType() {
        return type;
    }

    public int getColor() {
        return color;
    }

    public void setFirstPlay(boolean firstPlay) {
        this.firstPlay = firstPlay;
    }
}
