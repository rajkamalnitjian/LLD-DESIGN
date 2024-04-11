package com.example.LLD.Collections;


// Driver class to test above
class Main {
    public static void main(String[] args) {
        Pair<String,Integer> p1=new Pair<>("RAJKAMAL",345);
        ChildPair childPair =new ChildPair(124,"string");
        GenericMethodExample genericMethodExample=new GenericMethodExample();
        genericMethodExample.display("string","874t8348");
        Pizza pizza=new Pizza();
        System.out.println(pizza.getStatus());

    }
}

