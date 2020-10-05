package A3;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SummiererTest {
    Summierer summierer = new Summierer();

    @Test
    protected void kleinerGauss() {
        for (int i = 0; i <= 10; i++) {
            int randomInt = getRandomInt();
            assertEquals(helperGauss(randomInt), summierer.kleinerGauss(randomInt));
        }
    }

    @Test
    protected void forSumme() {
        for (int i = 0; i <= 10; i++) {
            int randomInt = getRandomInt();
            assertEquals(helperGauss(randomInt), summierer.forSumme(randomInt));
        }
    }

    @Test
    protected void rekursiveSumme() {
        for (int i = 0; i <= 10; i++) {
            int randomInt = getRandomInt();
            assertEquals(helperGauss(randomInt), summierer.rekursiveSumme(randomInt));
        }
    }

    private int helperGauss(int n) {
        return (n * (n + 1) / 2);
    }

    private int getRandomInt() {
        return (int) (Math.random() * (1000 - 1));
    }
}