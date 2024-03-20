package com.example.LLD.Collections;

/*

Rule of Multibound:- First extends should be class and rest other will be interface.
and whatever we pass through this should be parent of class and implements rest interfaces.
 */
class MultipleBound<T extends A & B>
{
    private T objRef;

    public MultipleBound(T obj)
    {
        this.objRef = obj;
    }

    public void run()
    {
        this.objRef.execute();
    }
}
interface B
{
    public void execute();
}
class C extends  A{
    void displayC(){
        System.out.println("Inside class C");
    }
}
 class A  implements B
{
    public void execute()
    {
        System.out.println("Inside class A");
    }
}
public class BoundedClass
{
    public static void main(String a[])
    {
        MultipleBound<C> obj= new MultipleBound<>(new C());
        obj.run();
    }
}