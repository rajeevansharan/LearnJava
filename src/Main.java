
interface Person
{
     void sing(String name);
}

class StudentR implements Person
{
    String name;
    @Override
    public void sing(String name) {
        this.name=name;

        System.out.println(name + " singing ");

    }
}
class Lecture implements Person
{
    String name;
    @Override
    public void sing(String name) {
        this.name=name;

    System.out.println(name + " singing ");
    }
}

class GetobjForClass {

    //when a method returns interface it actually returns the object of the class that implements that interface
    public Person getStobj(String name)
    {
        return new StudentR();  // it returns  object of StudentR class
    }

    public Person getLec(String name)
    {
        return new Lecture();  //It returns object of Lecture class
    }
}


public class Main {
    public static void main(String[] args) {

        try {
            int age = 5;
            if (age < 18) {
                throw new ArithmeticException("Your age should be greater than 18");
            }
            System.out.println("You are eligible.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
