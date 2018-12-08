package lesson5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List{
    private int size;
    private Object[] data;

    public MyArrayList() {
        data = new Object[10];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Cannot construct array with negative capacity");
        data = new Object[capacity];
    }

    public boolean add(Object value) {
        ensureCapacity(size + 1);
        this.data[size] =  (T) value;
        size++;
        return true;
    }

    public void add(T value, int index) {
        checkIndex(index);
        ensureCapacity(size + 1);
        if (data[index] == null) {
            this.data[index] = value;
        } else {
            Object tmp;
            Object temp2;
            tmp = data[index];
            data[index] = value;
            for (int i = index + 1; i < data.length - 1; i++) {
                temp2 = data[i];
                data[i] = tmp;
                tmp = temp2;
            }
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //unchecked cast//
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    public T remove(int index) {
        checkIndex(index);
        Object[] tempData = new Object[size];
        for (int i = index + 1; i < size; i++) {
            tempData[i] = this.data[i];
        }
        T temporary = (T)data[index];
        for (int i = index; i < size-1; i++) {
            this.data[i] = tempData[i + 1];
        }
        size--;
        return temporary;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    /**
     * ensure if data.length is greater than capacity if true - return;
     * otherwise increase internal data array size
     *
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        if (data.length >= capacity) return;
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException(" There is no such index in an ArrayList");
        }
    }

    public String toString (){
        String str = "";
        for (int i = 0; i < size ; i++) {
            str += data[i] + ", ";
        }return str;
    }
}
