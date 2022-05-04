package Lab5.ch4;

import Lab5.ch3.GenericList;
import Lab5.ch3.IGenericList;
import Lab5.ch3.IGenericNode;

import java.lang.reflect.Array;

public class ArrayIterator<T> implements IArrayIterator<T> {

    T[] array;
    int globalIndex;

    IGenericList<T> list;
    IGenericNode<T> globalNode;


    public ArrayIterator(T[] array) {
        this.array = array;
        this.list = null;
        this.globalNode = null;
        globalIndex = 0;
    }

    public ArrayIterator(IGenericList<T> list) {
        this.list = list;
        this.globalNode = list.getRoot();
        this.array = null;
    }

    @Override
    public boolean hasNext() {
        if(this.list == null) {
            if (globalIndex >= array.length)
                return false;
            return (array[globalIndex] != null);
        }

        if (globalNode == null) {
            return false;
        }
        return (globalNode != null);
    }

    @Override
    public T next() {
        if(this.list == null) {
            T toReturn = array[globalIndex];
            globalIndex++;
            return toReturn;
        }
        T toReturn = globalNode.getValue();
        globalNode = globalNode.getNext();
        return toReturn;
    }
}
