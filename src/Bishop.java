import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    public Bishop(int color) {
        super(Type.BISHOP, color);
    }

    public static void main(String[] args) {

        int x = 8;
        int y = 1;

        while (x != 0 && y != 9) {

            System.out.println(x + " " + y);
            x--;
            y++;

        }

    }

    @Override
    public List<int[]> play(Chessboard cb, int[] pos) {

        List<int[]> possibilities = new ArrayList<>();
        int[] move;

        if (!(pos[0] == 1 && pos[1] == 0)) {

            int x = pos[0] - 1;
            int y = pos[1] - 1;

            while (true) {

                if (y == 0 || x == 0) {
                    break;
                }

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                    break;
                } else {
                    break;
                }

                x--;
                y--;

            }

        }

        if (!(pos[0] == 8 && pos[1] == 8)) {

            int x = pos[0] + 1;
            int y = pos[1] + 1;

            while (true) {

                if (y == 9 || x == 9) {
                    break;
                }

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                    break;
                } else {
                    break;
                }

                x++;
                y++;

            }
        }

        if (!(pos[0] == 1 && pos[1] == 8)) {

            int x = pos[0] - 1;
            int y = pos[1] + 1;

            while (true) {

                if (x == 0 || y == 9) {
                    break;
                }

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                    break;
                } else {
                    break;
                }

                x--;
                y++;

            }

        }

        if (!(pos[0] == 8 && pos[1] == 1)) {

            int x = pos[0] + 1;
            int y = pos[1] - 1;

            while (true) {

                if (x == 9 || y == 0) {
                    break;
                }

                if (cb.getSquares()[x][y] == null) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                } else if (cb.getSquares()[x][y].getColor() != this.color) {
                    move = new int[]{x, y};
                    possibilities.add(move);
                    break;
                } else {
                    break;
                }

                x++;
                y--;

            }
        }


        return possibilities;

    }

}
