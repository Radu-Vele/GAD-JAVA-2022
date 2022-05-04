package Lab5.ch3;

public class GenericNode<T> implements IGenericNode<T> {
    T value;
    IGenericNode<T> next;
    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
