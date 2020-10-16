package EA1.a4.oldschool;

public class GoL {
    private final int gameSquareSize = 5;
    private boolean[][] field = new boolean[gameSquareSize][gameSquareSize];
    private boolean[][] nextGenField = new boolean[gameSquareSize][gameSquareSize];


    public static void main(String... args) {
        Integer revolutions = GoL.inputParamResolver(args);
        GoL myGame = new GoL();
        myGame.runGame(myGame, revolutions);
    }

    private static Integer inputParamResolver(String... inputArgs) {
        try {
            return Integer.parseInt(inputArgs[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }


    private void setCellStatus(int x, int y, boolean[][] gameBoard, boolean isAlive) {
        if (x > gameSquareSize || y > gameSquareSize) {
            System.out.println("Out of bounds");
            System.exit(1);
        }

        gameBoard[x][y] = isAlive;

    }

    private void runGame(GoL myGame, int iterations) {
        myGame.setCellStatus(1, 2, myGame.field, true);
        myGame.setCellStatus(2, 2, myGame.field, true);
        myGame.setCellStatus(3, 2, myGame.field, true);
        for (int i = 0; i < iterations; i++) {
            myGame.print(myGame.field);
            myGame.nextGeneration();
            myGame.field = myGame.nextGenField;
            // passed by referenced, kill state before next run
            myGame.nextGenField = new boolean[gameSquareSize][gameSquareSize];
            System.out.println();
        }
    }

    private void print(boolean[][] boardtoPrint) {
        for (int i = 0; i < gameSquareSize; i++) {
            for (int j = 0; j < gameSquareSize; j++) {
                if (boardtoPrint[i][j])
                    System.out.print("o ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    private void nextGeneration() {
        for (int row = 0; row < gameSquareSize; row++) {
            for (int column = 0; column < gameSquareSize; column++) {

                setCellStatus(row, column, nextGenField, false);

                int livingNeighbours = getNumberOfLivingNeighbours(row, column, field);
                if (livingNeighbours < 1) {
                    setCellStatus(row, column, nextGenField, false);
                }

                if (livingNeighbours >= 4) {
                    setCellStatus(row, column, nextGenField, false);
                }

                if ((livingNeighbours == 3 || livingNeighbours == 2) && field[row][column]) {
                    setCellStatus(row, column, nextGenField, true);
                }

                if (livingNeighbours == 3 && !field[row][column]) {
                    setCellStatus(row, column, nextGenField, true);
                }
            }
        }
    }

    private int getNumberOfLivingNeighbours(int row, int column, boolean[][] gameBoard) {
        int aliveNeighbours = 0;
        // upperleft
        if (row - 1 >= 0 && column - 1 >= 0 && gameBoard[row - 1][column - 1]) {
            aliveNeighbours++;
        }

        // left
        if (column - 1 >= 0 && gameBoard[row][column - 1]) {
            aliveNeighbours++;
        }

        // bottom left
        if (row + 1 <= gameSquareSize - 1 && column - 1 >= 0 && gameBoard[row + 1][column - 1]) {
            aliveNeighbours++;
        }

        // bottom
        if (row + 1 <= gameSquareSize - 1 && gameBoard[row + 1][column]) {
            aliveNeighbours++;
        }

        // bottom right

        if (row + 1 <= gameSquareSize - 1 && column + 1 <= gameSquareSize - 1 && gameBoard[row + 1][column + 1]) {

            aliveNeighbours++;
        }

        // right
        if (column + 1 <= gameSquareSize - 1 && gameBoard[row][column + 1]) {
            aliveNeighbours++;
        }

        // upper right
        if (row - 1 >= 0 && column + 1 <= gameSquareSize - 1 && gameBoard[row - 1][column + 1]) {
            aliveNeighbours++;
        }

        // upper middle
        if (row - 1 >= 0 && gameBoard[row - 1][column]) {
            aliveNeighbours++;
        }
        return aliveNeighbours;
    }
}
