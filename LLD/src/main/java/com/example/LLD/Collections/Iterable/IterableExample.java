package com.example.LLD.Collections.Iterable;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class IterableExample {
    public static void main(String args[]){
        List<Integer> linkedList = Collections.synchronizedList(new LinkedList<>());

        linkedList.add(33);
        linkedList.add(34);


        Iterator<Integer> iterable = linkedList.iterator();
//        iterable.forEachRemaining((val)-> System.out.println(val*2));// consumer only which accept in functional interface
//        System.out.println(iterable.equals(list));// compare with objects


        while(iterable.hasNext()) {
            try {
                int top = iterable.next();
//                 if(top==33)
//                 iterable.remove();// remove  current element from collection
                System.out.println(top);
            }catch(Exception ex){
                System.out.println(ex.getClass());
            }
        }
        System.out.println(linkedList);

        // for loop
         for(Integer a:linkedList)
             System.out.print(a.intValue()+" ");


         //for Each method
         linkedList.forEach((val)->{
             System.out.println(val);
         });
    }
}
