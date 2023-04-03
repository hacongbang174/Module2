package JavaCollectionFramework.deleteBinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("20");
        tree.insert("10");
        tree.insert("16");
        tree.insert("40");
        tree.insert("30");
        tree.insert("80");
        tree.insert("27");
        tree.insert("50");
        tree.insert("14");
        //traverse tree
        System.out.println("Postorder (sorted): ");
//        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        tree.delete("10");
//        tree.delete("20");
        tree.postorder();
    }
}
