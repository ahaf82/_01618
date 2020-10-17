package EA2.a3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {
    BinaryNode binaryNode;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        binaryNode = new BinaryNode(6);
        binaryNode.insert(5);
        binaryNode.insert(4);
        binaryNode.insert(12);
        binaryNode.insert(11);
        binaryNode.insert(10);

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testIfAddedValuesAreFound() {
        int someRandom = new Random().nextInt();
        binaryNode.insert(someRandom);
        assertTrue(binaryNode.contains(someRandom));
    }

    @Test
    void testIfNonAddedValuesAreFound() {
        assertFalse(binaryNode.contains(100));
    }

    @Test
    void testThatNumbersSmallerThanOthersAreFound() {
        binaryNode.insert(3);
        binaryNode.contains(3);
    }


    @Test
    void checkIfInorderHasCorrectStructure() {
        binaryNode.inorder();
        assertEquals("6\n5\n4\n12\n11\n10", outputStreamCaptor.toString()
                .trim());
    }
}