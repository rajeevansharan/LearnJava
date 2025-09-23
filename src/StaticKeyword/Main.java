package StaticKeyword;


public class Main {
    public static void main(String[] args) {

        StaticVariables s1 = new StaticVariables("Sharan");
        int age = StaticVariables.age;
        System.out.println(age);

        StaticMethods.sayHello();

        StaticNestedClass.NestedClass nc = new StaticNestedClass.NestedClass();
        nc.show();

    }
}

/*
package-private (default access modifier)

In Java, if you don’t explicitly specify an access modifier (public, protected, or private), the default is package-private (also called default access).

can be accessed only within the same package.

*/