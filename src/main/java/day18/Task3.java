package day18;

public class Task3 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(20);
        bt.add(14);
        bt.add(11);
        bt.add(16);
        bt.add(15);
        bt.add(18);
        bt.add(5);
        bt.add(8);
        bt.add(23);
        bt.add(22);
        bt.add(27);
        bt.add(24);
        bt.add(150);

        bt.printTreeNodes(bt.getRoot());
    }
}