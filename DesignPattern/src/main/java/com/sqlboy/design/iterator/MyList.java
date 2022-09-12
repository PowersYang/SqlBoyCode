package com.sqlboy.design.iterator;

public class MyList<E> implements MyCollection<E> {
    private Object[] containor;
    private int totalSize;
    private int currSize;

    public MyList(int size) {
        this.totalSize = size;
        this.containor = new Object[size];
    }

    public void add(E e) throws Exception {
        if (this.currSize == this.totalSize) {
            throw new Exception("容器已满");
        }

        containor[this.currSize] = e;
        currSize++;
    }

    @Override
    public MyIterator<E> getIterator() {
        return new MyListIterator<E>();
    }

    private class MyListIterator<E> implements MyIterator<E> {

        int index;

        @Override
        public boolean hasNext() {
            if (this.index < currSize) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                return (E) containor[index++];
            }
            return null;
        }
    }
}

