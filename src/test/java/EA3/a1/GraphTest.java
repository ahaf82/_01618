package EA3.a1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphTest {
    Graph graph;
    String[] fixtures = {"Deutschland", "Frankreich", "Spanien"};


    @BeforeEach
    public void constructionOfGraph(){
        graph = new Graph(fixtures);
    }


    @Test
    public void assertThatStringsAreCorrect() throws GraphException {
        for (int i = 0; i<fixtures.length; i++){
            Assertions.assertSame(fixtures[i], graph.getNode(i));
        }
    }

    @Test
    void assertThatExceptionIsThrownIfNodeIsNotInRange() {
        Assertions.assertThrows(GraphException.class, () -> {
            graph.getNode(10);
        });
    }

    @Test
    void assertThatNumberOfReturnedNodesIsCorrect() {
        Assertions.assertEquals(fixtures.length, graph.getNumberOfNodes());
    }

    @Test
    void assertThatNodesCanBeChanged() throws GraphException {
        String[] someOtherCountries = new String[]{"Germany", "England"};
        graph.setNodes(someOtherCountries);
        Assertions.assertSame(someOtherCountries[0], graph.getNode(0));
        Assertions.assertSame(someOtherCountries[1], graph.getNode(1));
    }

    @Test
    void assertThatIndexReturnedForString() throws GraphException {
        for (int i = 0; i<fixtures.length; i++){
            Assertions.assertEquals(i, graph.indexOf(fixtures[i]));
        }
    }

    @Test
    void assertThatExceptionBeingThrownIfNodeIsPresent() {
        Assertions.assertThrows(GraphException.class, () -> {
            graph.indexOf("SomeCountryNotInFixture");
        });
    }

    @Test
    void assertThatEdgesAreSetCorrectlyViaIndex() throws GraphException {
        graph.addEdge(0,1);
        Assertions.assertTrue(graph.isAdjacent(0,1));
        Assertions.assertTrue(graph.isAdjacent(1,0));
        Assertions.assertFalse(graph.isAdjacent(1,1));
    }

    @Test
    void assertThatEdgesAreSetCorrectlyViaCountryName() throws GraphException {
        graph.addEdge(fixtures[0], fixtures[1]);
        Assertions.assertTrue(graph.isAdjacent(0,1));
        Assertions.assertTrue(graph.isAdjacent(1,0));
        Assertions.assertFalse(graph.isAdjacent(1,1));
    }

    @Test
    void assertThatAdjacencyMatrixIsCorrectForCountries() throws GraphException {
        graph.addEdge(fixtures[0], fixtures[1]);
        graph.addEdge(fixtures[1], fixtures[2]);
    }
}