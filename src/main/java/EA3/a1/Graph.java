package EA3.a1;

import java.util.Arrays;

public class Graph {

    protected boolean[][] adjacencyMatrix;
    protected String[] nodes;

    protected int indexOf(String node) throws GraphException {
        if (!Arrays.asList(nodes).contains(node)) {
            throw new GraphException();
        } else {
            return Arrays.asList(nodes).indexOf(node);
        }


    }

    public Graph(int nodeNumber) {
        nodes = new String[nodeNumber];
        adjacencyMatrix = new boolean[nodeNumber][nodeNumber];
    }


    /**
     * @param nodes Dont be confused: This constructor calls other overloaded constructor. Very odd.
     */
    public Graph(String[] nodes) {
        this(nodes.length);
        setNodes(nodes);
    }

    public String getNode(int index) throws GraphException {
        try {
            return nodes[index];
        } catch (Exception e) {
            throw new GraphException();
        }
    }

    public void setNodes(String[] nodes) {
        System.arraycopy(nodes, 0, this.nodes, 0, nodes.length);
    }

    public int getNumberOfNodes() {
        return nodes.length;
    }

    public boolean isAdjacent(int index1, int index2) throws GraphException {
        try {
            return adjacencyMatrix[index1][index2];
        } catch (Exception e) {
            throw new GraphException();
        }
    }

    public boolean isAdjacent(String node1, String node2) throws GraphException {
        try {
           return this.isAdjacent(this.indexOf(node1), this.indexOf(node2));
        } catch (Exception e){
            throw new GraphException();
        }
    }

    public void addEdge(int index1, int index2) throws GraphException {
        try {
            adjacencyMatrix[index1][index2] = true;
            // Borders work both ways
            adjacencyMatrix[index2][index1] = true;
        } catch (Exception e) {
            throw new GraphException();
        }
    }

    public void addEdge(String node1, String node2) throws GraphException {
        try {
            this.addEdge(this.indexOf(node1), this.indexOf(node2));
        } catch (Exception e) {
            throw new GraphException();
        }
    }

}


