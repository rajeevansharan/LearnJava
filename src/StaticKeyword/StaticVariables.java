package StaticKeyword;

public class StaticVariables {

    /*
 Static Variable.

 Default is package-private (also called default access).

 Can be accessed only within the same package.

*/
    static int age = 22;    //static variable
    String name;            //instance variable


    public StaticVariables(String name) {
        this.name = name;
    }
}
