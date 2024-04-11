package com.example.LLD.Collections;

/*
Properties of Enum class
1:-it has collection of constants and by default it is static and final
2:-it cannot  extend any class as it internally extends java.lang.Enum class
3:-it can  implement interface
4:- it can have variables, constructor, methods
it cannot be initiated(as its  constructor is private only)
5:- no other class can extend enum class
it can have abstract method , and all constant should implement that abstract method
 */
 enum PizzaStatus {
    ORDERED{
        public void dummyMethod(){
            System.out.println("dummy from Ordered");
        }
    },
    READY{
        public void dummyMethod(){
            System.out.println("dummy from Ready");
        }
    },
    DELIVERED{
        public void dummyMethod(){
            System.out.println("dummy from Delivered");
        }
    };
}

   class Pizza   {
    private  PizzaStatus Status;

    public PizzaStatus getStatus(){
        return   Status;
    }
    public void setStatus(PizzaStatus ordered){
         Status=PizzaStatus.DELIVERED;
    }
}

