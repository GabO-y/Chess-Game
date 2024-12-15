import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(int color) {
        super(Type.KNIGHT, color);
    }

    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        List<int[]> possibilities = new ArrayList<>();
        int[] x;


        try {

            if (cb.getSquares()[pos[0] - 2][pos[1] + 1] == null) {

                x = new int[]{pos[0] - 2, pos[1] + 1};
                possibilities.add(x);

            } else if (cb.getSquares()[pos[0] - 2][pos[1] + 1].getColor() != color) {
                x = new int[]{pos[0] - 2, pos[1] + 1};
                possibilities.add(x);
            }
        } catch (Exception _) {
        }

        try {

            if (cb.getSquares()[pos[0] - 2][pos[1] - 1] == null) {

                x = new int[]{pos[0] - 2, pos[1] - 1};
                possibilities.add(x);

            } else if (cb.getSquares()[pos[0] - 2][pos[1] - 1].getColor() != this.color) {
                x = new int[]{pos[0] - 2, pos[1] - 1};
                possibilities.add(x);
            }
        } catch (Exception _) {
        }

        try {
            if (cb.getSquares()[pos[0] + 2][pos[1] + 1] == null) {

                x = new int[]{pos[0] + 2, pos[1] + 1};
                possibilities.add(x);

            } else if (cb.getSquares()[pos[0] + 2][pos[1] + 1].getColor() != this.color) {
                x = new int[]{pos[0] + 2, pos[1] + 1};
                possibilities.add(x);
            }
        } catch (Exception _) {
        }

        try {
            if (cb.getSquares()[pos[0] + 2][pos[1] - 1] == null) {
                x = new int[]{pos[0] + 2, pos[1] - 1};
                possibilities.add(x);
            } else if (cb.getSquares()[pos[0] + 2][pos[1] - 1].getColor() != this.color) {
                x = new int[]{pos[0] + 2, pos[1] - 1};
                possibilities.add(x);
            }
        } catch (Exception _) {
        }

        try {

            if (cb.getSquares()[pos[0] - 1][pos[1] + 2] == null) {

                x = new int[]{pos[0] - 1, pos[1] + 2};
                possibilities.add(x);

            } else if (cb.getSquares()[pos[0] - 1][pos[1] + 2].getColor() != this.color) {
                x = new int[]{pos[0] - 1, pos[1] + 2};
                possibilities.add(x);
            }

        } catch (Exception _) {

        }

        try {
            if (cb.getSquares()[pos[0] + 1][pos[1] + 2] == null) {

                x = new int[]{pos[0] + 1, pos[1] + 2};
                possibilities.add(x);

            } else if (cb.getSquares()[pos[0] + 1][pos[1] + 2].getColor() != this.color) {

                x = new int[]{pos[0] + 1, pos[1] + 2};
                possibilities.add(x);

            }
        } catch (Exception _) {
        }

        try {

            if (cb.getSquares()[pos[0] - 1][pos[1] - 2] == null) {
                x = new int[]{pos[0] - 1, pos[1] - 2};
                possibilities.add(x);
            } else if (cb.getSquares()[pos[0] - 1][pos[1] - 2].getColor() != this.color) {
                x = new int[]{pos[0] - 1, pos[1] - 2};
                possibilities.add(x);
            }

        } catch (Exception _) {
        }

        try {

            if (cb.getSquares()[pos[0] + 1][pos[1] - 2] == null) {
                x = new int[]{pos[0] + 1, pos[1] - 2};
                possibilities.add(x);
            } else if (cb.getSquares()[pos[0] + 1][pos[1] - 2].getColor() != this.color) {
                x = new int[]{pos[0] + 1, pos[1] - 2};
                possibilities.add(x);
            }

        } catch (Exception _) {
        }

        return possibilities;

    }

}
