package EA1.a4;

public class GameOfLive {
    private int gameSquareSize = 5;
    private final GodEntity godEntity = new GodEntity();
    public Cell[][] universe = godEntity.createUniverse(gameSquareSize);

    public static void main(String[] args) {
        GameOfLive myGame = new GameOfLive();
        myGame.godEntity.setAliveOrDead(myGame.universe, 1,2, true);
        myGame.godEntity.setAliveOrDead(myGame.universe, 2,2, true);
        myGame.godEntity.setAliveOrDead(myGame.universe, 3,2, true);
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
        }
    }

    void nextGeneration() {
        Cell[][] nextUniverse = godEntity.createUniverse(gameSquareSize);
        for (int row = 0; row < gameSquareSize; row++) {
            for (int column = 0; column < gameSquareSize; column++) {
                int livingNeighbours = godEntity.countNeighboursAlive(universe, row, column);
                if (livingNeighbours < 1) {
                    godEntity.setAliveOrDead(nextUniverse, row, column, false);
                }

                if (livingNeighbours >= 4) {
                    godEntity.setAliveOrDead(nextUniverse, row, column, false);
                }

                if ((livingNeighbours == 3 || livingNeighbours == 2) && universe[row][column].isAlive) {
                    godEntity.setAliveOrDead(nextUniverse, row, column, true);
                }

                if (livingNeighbours == 3 && !universe[row][column].isAlive) {
                    godEntity.setAliveOrDead(nextUniverse, row, column, true);
                }
            }
        }
        universe = nextUniverse;

    }

    void print() {
        for (Cell[] boolArray : universe) {
            for (Cell boolArrayLevel2 : boolArray) {
                if (boolArrayLevel2.isAlive)
                    System.out.print("o ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

}