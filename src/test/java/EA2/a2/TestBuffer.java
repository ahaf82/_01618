package EA2.a2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestBuffer {
    Buffer buffer;

    @BeforeEach
    void setUp(){
        buffer = new Buffer(10);
    }

    @Test
    void testThatCorrectAmountIfEntriesIsCreated() {
        int counter = 1;
        Buffer.Entry currentElement = buffer.firstElement.getNext();
        while (currentElement != buffer.firstElement ){
            counter++;
            currentElement = currentElement.getNext();
        }
        assertEquals(10, counter);
        System.out.println(counter);
    }

    @Test
    void testThatStringsAreAddedToEachItem(){
        buffer.insert("SomeString");
        Buffer.Entry currentElement = buffer.firstElement.getNext();
        while (currentElement != buffer.firstElement ){
            assertEquals("SomeString", currentElement.getElement());
            currentElement = currentElement.getNext();
        }
    }
}