package Abstract;

abstract class AbstractClass {

    String name;
    int age;


    abstract void print();      //Abstract method


    void print1()  //Concrete method
    {
        System.out.println("AbstractClass");
    }


    AbstractClass()
    {
        System.out.println("AbstractClass Constructor");
    }
}

class SubClass extends AbstractClass {

    public SubClass() {
        System.out.println("SubClass Constructor");
    }

    void print() {
        System.out.println("SubClass");
    }

}

public class Main {
    public static void main(String[] args) {

        SubClass obj = new SubClass();
        obj.print();
        obj.print1();



    }
}