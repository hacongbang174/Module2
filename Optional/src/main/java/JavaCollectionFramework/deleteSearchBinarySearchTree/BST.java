package JavaCollectionFramework.deleteSearchBinarySearchTree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }
    @Override
    public boolean insert(E e) {
        if(root == null) {
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if(e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }

            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }
    public boolean delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while (current != null && !current.element.equals(e)) {
            parent = current;
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false; // Element not found
        }

        if (current.left == null) { // Case 1: No left child
            replaceNode(parent, current, current.right);
        } else { // Case 2: Has left child
            TreeNode<E> maxNode = current.left;
            current.element = maxNode.element;
            replaceNode(parent, maxNode, maxNode.left);
        }
        return true;
    }
    public boolean search(E element) {
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }
    private void replaceNode(TreeNode<E> parent, TreeNode<E> node, TreeNode<E> child) {
        if (parent == null) {
            root = child;
        } else if (node == parent.left) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }
}
