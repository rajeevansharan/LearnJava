package StaticKeyword;

public class StaticMethods {


    static String NickName;
    String name;

    /*
    Static Block

    Used for initialization of static variables.

    Runs once when the class is loaded into memory (before main or object creation).

    */

    static {
        NickName = "Sharan";
        System.out.println("Static block is executed");
    }


    /*
    Belong to the class, not to objects

    Can only access static variables and other static methods directly

    Cannot use this or super (since they belong to objects).

    */

    static void sayHello() {
        System.out.println("Hello");
    }

    static void Greeting() {
        //  this.name = name;
        System.out.println("GoodBye" + NickName);
    }


}
