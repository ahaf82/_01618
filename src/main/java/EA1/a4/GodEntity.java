package EA1.a4;

public class GodEntity {
    public Cell[][] createUniverse(Integer size) {
        Cell[][] universe = new Cell[size][size];
        for(int i = 0; i < universe.length; i++)
        {
            for(int k = 0; k < universe[i].length; k++){
                universe[i][k] = new Cell(false);
            }
        }
        return universe;
    }

    public void setAliveOrDead(Cell[][] universe, Integer row, Integer column, Boolean isAlive){
            universe[row][column].setIsAlive(isAlive);
    }

    public int countNeighboursAlive(Cell[][] universe, Integer row, Integer column){
        int aliveNeighbours = 0;
        // upperleft
        if (row - 1 >= 0 && column - 1 >= 0 && universe[row - 1][column - 1].isAlive) {
            aliveNeighbours++;
        }

        // left
        if (column - 1 >= 0 && universe[row][column - 1].isAlive) {
            aliveNeighbours++;
        }

        // bottom left
        if (row + 1 <= universe.length - 1 && column - 1 >= 0 && universe[row + 1][column - 1].isAlive) {
            aliveNeighbours++;
        }

        // bottom
        if (row + 1 <= universe.length - 1 && universe[row + 1][column].isAlive) {
            aliveNeighbours++;
        }

        // bottom right

        if (row + 1 <= universe.length - 1 && column + 1 <= universe.length - 1 && universe[row + 1][column + 1].isAlive) {

            aliveNeighbours++;
        }

        // right
        if (column + 1 <= universe.length - 1 && universe[row][column + 1].isAlive) {
            aliveNeighbours++;
        }

        // upper right
        if (row - 1 >= 0 && column + 1 <= universe.length - 1 && universe[row - 1][column + 1].isAlive) {
            aliveNeighbours++;
        }

        // upper middle
        if (row - 1 >= 0 && universe[row - 1][column].isAlive) {
            aliveNeighbours++;
        }
        return aliveNeighbours;
    }
}
