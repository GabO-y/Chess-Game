import java.util.List;
import java.util.Scanner;

public class Chessboard {

    public static Scanner sc = new Scanner(System.in);

    private final Piece[][] squares = new Piece[9][9];
    private int playerTime = 1;

    public static void main(String[] args) {

        Chessboard chessboard = new Chessboard();

        chessboard.initGame();

    }

    public void initGame() {


        squares[2][1] = new Pawn(2);
        squares[2][2] = new Pawn(2);
        squares[2][3] = new Pawn(2);
        squares[2][4] = new Pawn(2);
        squares[2][5] = new Pawn(2);
        squares[2][6] = new Pawn(2);
        squares[2][7] = new Pawn(2);
        squares[2][8] = new Pawn(2);

        squares[7][1] = new Pawn(1);
        squares[7][2] = new Pawn(1);
        squares[7][3] = new Pawn(1);
        squares[7][4] = new Pawn(1);
        squares[7][5] = new Pawn(1);
        squares[7][6] = new Pawn(1);
        squares[7][7] = new Pawn(1);
        squares[7][8] = new Pawn(1);

        squares[8][8] = new Rook(1);
        squares[8][1] = new Rook(1);

        squares[1][1] = new Rook(2);
        squares[1][8] = new Rook(2);

        squares[8][2] = new Knight(1);
        squares[8][7] = new Knight(1);

        squares[1][2] = new Knight(2);
        squares[1][7] = new Knight(2);

        squares[8][3] = new Bishop(1);
        squares[8][6] = new Bishop(1);

        squares[1][3] = new Bishop(2);
        squares[1][6] = new Bishop(2);

        squares[8][5] = new King(1);
        squares[1][5] = new King(2);

        squares[8][4] = new Queen(1);
        squares[1][4] = new Queen(2);


        while (true) {

            int winner = 0;
            int aux = 0;

            for (int i = 1; i < 9; i++) {


                for (int l = 1; l < 9; l++) {

                    if (squares[i][l] != null) {

                        if (squares[i][l].getType() == Type.KING) {

                            winner = squares[i][l].getColor();
                            aux++;

                        }

                    }

                }

            }

            if (aux != 2) {
                if (winner == 1) {
                    System.out.println("\nWhite wins\n");
                } else {
                    System.out.println("\nBlack wins\n");
                }
                showGame();
                return;
            }


            List<int[]> moves;

            showGame();

            System.out.print("Enter the position piece: ");
            int[] pos = enterMove();

            if (squares[pos[0]][pos[1]] == null) {
                System.out.println("Null position");
                continue;
            } else if (squares[pos[0]][pos[1]].getColor() != playerTime) {
                System.out.println("Not is your turn");
                continue;
            } else {
                moves = squares[pos[0]][pos[1]].play(this, pos);
            }

            if (moves.isEmpty()) {

                System.out.println("There are not possibles moves");
                continue;

            }

            boolean success = false;

            while (true) {

                System.out.print("Enter your play: ");
                int[] yourPlay = enterMove();

                for (int[] move : moves) {

                    try {

                        if (squares[move[0]][move[1]].getType() == Type.ROOK && squares[pos[0]][pos[1]].getType() == Type.KING) {

                            if (move[0] == yourPlay[0] && move[1] == yourPlay[1]) {

                                if (move[1] > pos[1]) {

                                    squares[pos[0]][pos[1] + 2] = squares[pos[0]][pos[1]];
                                    squares[pos[0]][pos[1]] = null;
                                    squares[pos[0]][pos[1] + 1] = squares[move[0]][move[1]];
                                    squares[move[0]][move[1]] = null;

                                    success = true;

                                    break;

                                }

                                if (move[1] < pos[1]) {

                                    squares[pos[0]][pos[1] - 2] = squares[pos[0]][pos[1]];
                                    squares[pos[0]][pos[1]] = null;
                                    squares[pos[0]][pos[1] - 1] = squares[move[0]][move[1]];
                                    squares[move[0]][move[1]] = null;

                                    success = true;

                                    break;

                                }

                            }

                        }

                    } catch (Exception _) {
                    }

                    if (move[0] == yourPlay[0] && move[1] == yourPlay[1]) {

                        squares[pos[0]][pos[1]].setFirstPlay(false);

                        squares[move[0]][move[1]] = squares[pos[0]][pos[1]];

                        squares[pos[0]][pos[1]] = null;

                        success = true;

                        break;

                    }

                }

                if (success) {

                    if (playerTime == 1) {
                        playerTime = 2;
                    } else {
                        playerTime = 1;
                    }


                    break;

                } else {
                    System.out.println("Invalid play");
                }

            }

        }

    }

    public void showGame() {

        char letter;

        System.out.println("\t A\t   B\t C\t   D\t E\t   F\t G\t   H");

        for (int i = 1; i < 9; i++) {

            for (int l = 0; l < 9; l++) {

                if (l == 0) {
                    System.out.print(i + "  ");
                    continue;
                }


                if (squares[i][l] == null) {

                    letter = (char) l;
                    letter += 64;

                    System.out.print(" " + letter + i + "   ");

                } else if (squares[i][l].getType() == Type.PAWN) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" P(W) ");
                    } else if (squares[i][l].getColor() == 2) {
                        System.out.print(" P(B) ");
                    }
                } else if (squares[i][l].getType() == Type.KING) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" K(W) ");
                    } else if (squares[i][l].getColor() == 2) {
                        System.out.print(" K(B) ");
                    }
                } else if (squares[i][l].getType() == Type.KNIGHT) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" N(W) ");
                    } else if (squares[i][l].getColor() == 2) {
                        System.out.print(" N(B) ");
                    }
                } else if (squares[i][l].getType() == Type.ROOK) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" R(W) ");
                    } else {
                        System.out.print(" R(B) ");
                    }
                } else if (squares[i][l].getType() == Type.BISHOP) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" B(W) ");
                    } else {
                        System.out.print(" B(B) ");
                    }
                } else if (squares[i][l].getType() == Type.QUEEN) {
                    if (squares[i][l].getColor() == 1) {
                        System.out.print(" Q(W) ");
                    } else {
                        System.out.print(" Q(B) ");
                    }
                }

            }

            System.out.println();
            System.out.println();

        }

    }

    public int[] enterMove() {

        String pos;

        int[] posInt = new int[2];

        while (true) {

            pos = sc.nextLine();

            if (pos.length() != 2) {
                System.out.println("Invalid input");
                continue;
            }

            char aux = 'a';
            boolean verification = true;

            for (int i = 0; i < 8; i++) {

                if (pos.charAt(0) == aux) {
                    verification = false;
                }

                aux++;
            }

            if (((pos.charAt(1) - 48) < 1 || (pos.charAt(1) - 48) > 8)) {
                System.out.println("The second need to be  a number between 1 to 8");
                continue;
            }

            if (verification) {
                System.out.println("The first need to be a letter between A to B");
                continue;
            }

            posInt[0] = pos.charAt(1) - 48;
            posInt[1] = pos.charAt(0) - 96;

            break;

        }

        return posInt;

    }

    public Piece[][] getSquares() {
        return squares;
    }
}