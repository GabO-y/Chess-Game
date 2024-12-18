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

        if (firstPlay) {

            for (int y = pos[1] + 1; y != 9; y++) {

                if (cb.getSquares()[pos[0]][y] != null) {

                    if (cb.getSquares()[pos[0]][y].getType() == Type.ROOK) {

                        if (cb.getSquares()[pos[0]][y].getColor() == color) {

                            if (cb.getSquares()[pos[0]][y].firstPlay) {

                                possibilities.add(new int[]{pos[0], y});

                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }

                }

            }

            for (int y = pos[1] - 1; y != 0; y--) {

                if (cb.getSquares()[pos[0]][y] != null) {

                    if (cb.getSquares()[pos[0]][y].getType() == Type.ROOK) {

                        if (cb.getSquares()[pos[0]][y].getColor() == color) {

                            if (cb.getSquares()[pos[0]][y].firstPlay) {

                                possibilities.add(new int[]{pos[0], y});

                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }

                }

            }

        }

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

        return possibilities;

    }


}
