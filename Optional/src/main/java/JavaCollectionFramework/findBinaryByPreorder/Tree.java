package JavaCollectionFramework.findBinaryByPreorder;

public interface Tree<E> {
    public boolean insert(E e);
    public void preorder();
    public int getSize();
}
