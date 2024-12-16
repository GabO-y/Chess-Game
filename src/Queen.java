import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    public Queen(int color) {
        super(Type.QUEEN, color);
    }

    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        Bishop b = new Bishop(this.color);
        Rook r = new Rook(this.color);

        List<int[]> possibilities = new ArrayList<>(b.play(cb, pos));

        possibilities.addAll(r.play(cb, pos));

        return possibilities;

    }

}
