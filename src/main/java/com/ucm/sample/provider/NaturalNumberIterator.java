package com.ucm.sample.provider;

import java.util.Iterator;

public class NaturalNumberIterator implements Iterator<Integer> {

    private int counter;

    NaturalNumberIterator() {
        this.counter = 1;
    }

    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        return this.counter++;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}