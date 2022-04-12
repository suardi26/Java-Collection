package com.practice;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {

    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(this.data).iterator();
    }

    @Override
    public int size() {
        return this.data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        if (this.data == null){
            this.data = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        E temp = this.data;
        this.data = null;
        return temp;
    }

    @Override
    public E peek() {
        return this.data;
    }
}
