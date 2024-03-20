package com.example.LLD.Collections;
/*
Example of generic class
*/
class Pair<T,V> {
    // An object of type T is declared
    T obj1;
    V obj2;
    Pair(T obj1,V obj2) { this.obj1 = obj1;  this.obj2=obj2; } // constructor
    public T getObject1() { return this.obj1; }
    public V getObject2() { return this.obj2; }
}

// example of generic class with inheritance
//generics with bound
class  ChildPair<T extends  Number,V extends String> extends Pair {
    ChildPair(T obj1, V obj2) {
        super(obj1, obj2);
    }
}

// example of generic method
class GenericMethodExample{
    public <p1,p2>  void display(p1 value1,p2 value2){
    }
}
