package JavaCollectionFramework.findBinaryByPreorder;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("27");
        tree.insert("14");
        tree.insert("10");
        tree.insert("19");
        tree.insert("35");
        tree.insert("31");
        tree.insert("42");
        //traverse tree
        System.out.println("Postorder (sorted): ");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
