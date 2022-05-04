package Lab5.ch3;

public interface IGenericList<T> {
    void insert(T element);
    void println();
    IGenericNode getRoot();
}
