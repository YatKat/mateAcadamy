package lesson5;

public class MyArrayList<T> {
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

    public void add(T value) {
        ensureCapacity(size + 1);
        this.data[size] = value;
        size++;
    }

    public void add(T value, int index) {
        ensureCapacity(size + 1); //return array with data with the same or greater capacity;
        Object[] tempData = new Object[size];
        // copy the data array beginning from index to temporary array;
        for (int i = index; i < size; i++) {
            tempData[i] = this.data[i];
        }
        this.data[index] = value; //add new value
        // cope the rest data after index from temporary array to data array;
        for (int i = index + 1; i < size; i++) {
            this.data[i] = tempData[i];
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

    public void remove(int index) {
        checkIndex(index);
        Object[] tempData = new Object[size];
        for (int i = index + 1; i < size; i++) {
            tempData[i] = this.data[i];
        }
        for (int i = index; i < size; i++) {
            this.data[i] = tempData[i + 1];
        }
        size--;
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
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException(" There is no such index in an ArrayList");
        }
    }
}
