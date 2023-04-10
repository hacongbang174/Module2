package repository;

public interface IModel<T> {
    int getId();
    void update (T obj);
    T parseData(String line);
}
