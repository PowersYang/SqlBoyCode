package com.sqlboy.design.iterator;

public interface MyCollection<E> {
    MyIterator<E> getIterator();
}
