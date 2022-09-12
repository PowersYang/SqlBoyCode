package com.sqlboy.design.iterator;

public class IteratorTest {
    public static void main(String[] args) throws Exception {
        MyList<String> myList = new MyList(10);
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");

        MyIterator<String> iterator = myList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
