import java.util.ArrayList;
import java.util.List;

public class King extends Piece {


    public King(int color) {
        super(Type.KING, color);
    }

    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        List<int[]> possibilities = new ArrayList<>();
        int[] move;


        int x = pos[0] - 1;
        int y = pos[1];

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        x += 2;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        x--;
        y++;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        y -= 2;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        y += 2;
        x++;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        x -= 2;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        y -= 2;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        x += 2;

        if (!(x == 0 || y == 0)) {

            try {

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                }

            } catch (Exception _) {
            }

        }

        for (int[] moves : possibilities) {
            System.out.println(moves[0] + " " + moves[1]);
        }

        return possibilities;

    }

}
