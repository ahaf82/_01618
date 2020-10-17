package EA2.a3;

class BinaryNode {
    private BinaryNode leftSon, rightSon;
    private final int value;

    public BinaryNode(int valueForFirstNode) {
        value = valueForFirstNode;
    }

    public boolean contains(int valueToFind) { /* s. a) ... */
        if (value == valueToFind) return true;

        if (valueToFind > value && null != rightSon)
            return rightSon.contains(valueToFind);

        if (valueToFind < value && null != leftSon)
            return leftSon.contains(valueToFind);

        return false;
    }

    public void insert(int valueToAdd) {
        if (value == valueToAdd) return;

        if (valueToAdd > value) {
            //value is bigger lets insert it at the right nodes
            if (null == rightSon) rightSon = new BinaryNode(valueToAdd);

            // going deeper underground
            rightSon.insert(valueToAdd);
        }

        if (valueToAdd < value) {
            if (null == leftSon) leftSon = new BinaryNode(valueToAdd);

            // going deeper underground
            leftSon.insert(valueToAdd);
        }


    }

    public void inorder() {
        System.out.println(value);
        if (null != leftSon) leftSon.inorder();
        if (null != rightSon) rightSon.inorder();
    }
}
