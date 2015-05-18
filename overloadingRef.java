//Overloading by references
class Animal
{}
class Horse extends Animal
{}
public class overloadingRef
{
    public void doStuff(Animal a)
    {
        System.out.println("Animal");
    }
    public void doStuff(Horse b)
    {
        System.out.println("Horse");
    }
    public static void main(String[] args)
    {
        overloadingRef or=new overloadingRef();
        Animal an=new Animal();
        Horse ho=new Horse();
        or.doStuff(an);
        or.doStuff(ho);
    }
}