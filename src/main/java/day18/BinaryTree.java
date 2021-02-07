package day18;

public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void add(int value) {
        this.root = addTo(this.root, value);
    }

    private Node addTo(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        Node newNode = null;
        if (value < node.getValue()) {
            newNode = addTo(node.getLeft(), value);
            node.setLeft(newNode);
        } else if (value > node.getValue()) {
            newNode = addTo(node.getRight(), value);
            node.setRight(newNode);
        } else {
            return node;
        }

        return node;
    }

    public void printTreeNodes(Node node) {
        if (node != null) {
            printTreeNodes(node.getLeft());
            System.out.print(" " + node.getValue());
            printTreeNodes(node.getRight());
        }
    }
}
