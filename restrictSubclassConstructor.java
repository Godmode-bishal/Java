//Restricting Constructors in subclass- nahi hota. Gives error while compiling.
public class restrictSubclassConstructor
{
    public static void main(String[] args)
    {
        Animal a=new Animal();
        Animal b=new Horse();
        a.eat();
        b.eat();
    }
}
class Animal
{
     void eat()
    {
        System.out.println("Superclass method");
    }
}
class Horse extends Animal
{
    public void eat()
    {
        System.out.println("Subclass method");
    }
}