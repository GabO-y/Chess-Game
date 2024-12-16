import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(int color) {
        super(Type.ROOK, color);
    }


    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        List<int[]> possibilities = new ArrayList<>();
        int[] x;

        for (int i = pos[0] + 1; i <= 8; i++) {

            if (cb.getSquares()[i][pos[1]] == null) {
                x = new int[]{i, pos[1]};
                possibilities.add(x);
            } else if (cb.getSquares()[i][pos[1]].getColor() != this.color) {
                x = new int[]{i, pos[1]};
                possibilities.add(x);
                break;
            } else {
                break;
            }

        }

        for (int i = pos[0] - 1; i >= 1; i--) {

            if (cb.getSquares()[i][pos[1]] == null) {
                x = new int[]{i, pos[1]};
                possibilities.add(x);
            } else if (cb.getSquares()[i][pos[1]].getColor() != this.color) {
                x = new int[]{i, pos[1]};
                possibilities.add(x);
                break;
            } else {
                break;
            }

        }

        for (int i = pos[1] + 1; i <= 8; i++) {

            if (cb.getSquares()[pos[0]][i] == null) {
                x = new int[]{pos[0], i};
                possibilities.add(x);
            } else if (cb.getSquares()[pos[0]][i].getColor() != this.color) {
                x = new int[]{pos[0], i};
                possibilities.add(x);
                break;
            } else {
                break;
            }

        }

        for (int i = pos[1] - 1; i >= 1; i--) {

            if (cb.getSquares()[pos[0]][i] == null) {
                x = new int[]{pos[0], i};
                possibilities.add(x);
            } else if (cb.getSquares()[pos[0]][i].getColor() != this.color) {
                x = new int[]{pos[0], i};
                possibilities.add(x);
                break;
            } else {
                break;
            }

        }

        return possibilities;
    }

}
