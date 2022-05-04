package Lab5.ch3;

public class GenericList<T> implements IGenericList<T>{

    IGenericNode<T> root = null;

    public GenericList(T rootValue) {
        this.root = new GenericNode<>();
        root.setValue(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> toInsert = new GenericNode<>();
        toInsert.setValue(element);
        if(this.root == null) {
            System.out.println("Empty list");
            return;
        }
        IGenericNode<T> current_node = this.root;
        while(current_node.getNext() != null) {
            current_node = current_node.getNext();
        }
        current_node.setNext(toInsert);
    }

    @Override
    public void println() {
        if(this.root == null) {
            System.out.println("Empty list");
            return;
        }
        IGenericNode<T> current_node = this.root;
        while(current_node.getNext() != null) {
            System.out.print(current_node.getValue() + " ");
            current_node = current_node.getNext();
        }
    }

    public IGenericNode<T> getRoot() {
        return root;
    }
}
