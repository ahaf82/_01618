package a4;

public class Cell {
    Boolean isAlive;

    Cell(Boolean alive){
        if (alive == null) alive = false;
        setIsAlive(alive);
    }

    void setIsAlive(Boolean alive){
        this.isAlive = alive;
    }
}
