package Polymorphism;

public class Main {
    public static void main (String[] args)
    {
        MethodOverloading m1 = new MethodOverloading(10,20);


        m1.Print(10,20);
        m1.Print(10,20,30);    //Method Overloading


      MethodOverriding m2 = new Subclass1();
      MethodOverriding m3 = new Subclass2();

      m2.Greeting();
      m3.Greeting();     //Method overriding

    }
}

