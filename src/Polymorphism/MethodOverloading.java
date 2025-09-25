package Polymorphism;

/*
* Compile-time Polymorphism
* Same method name, but different parameters
* Decided at compile time
* */
public class MethodOverloading {
    int a ;
    int b ;
    int c ;

    MethodOverloading(int a , int b)
    {
        this.a =a;
        this.b = b;

    }

    void  Print(int a , int b)
    {
      System.out.println(a+b);
    }

    void Print(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
