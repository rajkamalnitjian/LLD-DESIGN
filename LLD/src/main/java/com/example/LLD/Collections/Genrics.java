package com.example.LLD.Collections;

class Pair<T,V> {
    // An object of type T is declared
    T obj1;
    V obj2;
    Pair(T obj1,V obj2) { this.obj1 = obj1;  this.obj2=obj2; } // constructor
    public T getObject1() { return this.obj1; }
    public V getObject2() { return this.obj2; }

    public T getKey() {
        return getObject1();
    }
    public  V getValue() {
        return getObject2();
    }
}

