// Superclass throwing exception and subclass not throwing exception
class Animal
{
    public void eat() throws Exception
    {
        System.out.println("Super");
    }
}
public class SuperClassExceptionSubclassNoException extends Animal
{
    public void eat()
    {
        System.out.println("Sub");
    }
    public static void main(String[] args)
    {
        Animal a=new SuperClassExceptionSubclassNoException();
        SuperClassExceptionSubclassNoException b=new SuperClassExceptionSubclassNoException();
        a.eat();
        b.eat();
    }
}