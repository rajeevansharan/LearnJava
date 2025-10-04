
class Example
{
    int age;
    String name;

     Example(int age, String name)
    {
        this.age = age;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        Example s = (Example) o;
        return age == s.age && name.equals(s.name);
    }
}
public class Equality {

    public static void main(String[] args)
    {

        Example ex1 = new Example(22,"Sharan");
        Example ex2 = new Example(22,"Sharan");

        System.out.println(ex1 == ex2);
        System.out.println(ex1.equals(ex2));


    }
}
