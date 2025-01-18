import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {


    public Pawn(int color) {
        super(Type.PAWN, color);
    }

    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        List<int[]> possibilities = new ArrayList<>();
        int[] x;

        if (this.color == 1) {

            if (cb.getSquares()[pos[0] - 1][pos[1]] == null) {

                x = new int[]{pos[0] - 1, pos[1]};

                possibilities.add(x);

            }

            try {

                if (cb.getSquares()[pos[0] - 1][pos[1] + 1] != null) {

                    if (cb.getSquares()[pos[0] - 1][pos[1] + 1].getColor() == 2) {

                        x = new int[]{pos[0] - 1, pos[1] + 1};

                        possibilities.add(x);

                    }

                }

                if (cb.getSquares()[pos[0] - 1][pos[1] - 1] != null) {

                    if (cb.getSquares()[pos[0] - 1][pos[1] - 1].getColor() == 2) {

                        x = new int[]{pos[0] - 1, pos[1] - 1};

                        possibilities.add(x);

                    }

                }
            } catch (Exception _) {
            }

            if (firstPlay) {

                if (cb.getSquares()[pos[0] - 2][pos[1]] == null && cb.getSquares()[pos[0] - 1][pos[1]] == null) {

                    x = new int[]{pos[0] - 2, pos[1]};

                    possibilities.add(x);

                }

            }

        } else {

            if (cb.getSquares()[pos[0] + 1][pos[1]] == null) {

                x = new int[]{pos[0] + 1, pos[1]};

                possibilities.add(x);

            }

            try {

                if (cb.getSquares()[pos[0] + 1][pos[1] + 1] != null) {

                    if (cb.getSquares()[pos[0] + 1][pos[1] + 1].getColor() == 1) {

                        x = new int[]{pos[0] + 1, pos[1] + 1};

                        possibilities.add(x);

                    }

                }

                if (cb.getSquares()[pos[0] + 1][pos[1] - 1] != null) {

                    if (cb.getSquares()[pos[0] + 1][pos[1] - 1].getColor() == 1) {

                        x = new int[]{pos[0] + 1, pos[1] - 1};

                        possibilities.add(x);

                    }

                }

            } catch (Exception _) {
            }

            try{
            if (firstPlay) {

                if (cb.getSquares()[pos[0] + 2][pos[1]] == null && cb.getSquares()[pos[0] + 1][pos[1]] == null) {

                    x = new int[]{pos[0] + 2, pos[1]};

                    possibilities.add(x);

                }

            }

            }catch(Exception _){}

        }

        return possibilities;
    }


}
