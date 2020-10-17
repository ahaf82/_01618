package EA2.a2;

public class Buffer {

    Entry firstElement = new Entry(null, null, null);
    Entry currentElement;
    int maxElements;

    Buffer(int maxElements) {
        this.maxElements = maxElements;

        for (int i = 0; i < this.maxElements; i++) {
            // connect all new items
            if (i == 0) { // first Element connects to itself
                firstElement.next = firstElement;
                firstElement.previous = firstElement;
                currentElement = firstElement;
            } else {
                currentElement.next = new Entry(null, null, currentElement);
                currentElement = currentElement.next;
            }

            if (i + 1 == this.maxElements) {
                // connect the very last item in the for loop with the very first
                currentElement.next = firstElement;
            }
        }

        while (currentElement != firstElement) {
            // connect the previous items accordingly
            assert currentElement != null;
            currentElement.next.previous = currentElement;
            currentElement = currentElement.next;
        }
    }

    void insert(String someString) {
        // I GUESS that the insert method should add the same text to every item? Has not been defined in the task
        firstElement.element = someString;
        currentElement = firstElement.next;
        while (currentElement != firstElement) {
            currentElement.element = someString;
            currentElement = currentElement.next;
        }
    }

    void print(){
        currentElement = firstElement.previous;
        while (currentElement != firstElement) {
            System.out.println(currentElement.element);
            currentElement = currentElement.previous;
        }
    }

    static class Entry {
        private String element;
        private Entry next;
        private Entry previous;

        private Entry(String element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        String getElement(){
            return element;
        }

        Entry getNext(){
            return next;
        }

        Entry getPrevious(){
            return previous;
        }
    }
}
