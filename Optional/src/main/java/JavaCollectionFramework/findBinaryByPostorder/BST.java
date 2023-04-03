package JavaCollectionFramework.findBinaryByPostorder;
import java.util.Comparator;
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
}
