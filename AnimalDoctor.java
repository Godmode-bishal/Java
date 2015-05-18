import java.util.*;
abstract class Animal
{
    public abstract void checkUp();
}
class Dog extends Animal
{
    public void checkUp()
    {
        System.out.println("Dog Checkup");
    }
}
class Cat extends Animal
{
    public void checkUp()
    {
        System.out.println("Cat checkup");
    }
}
class Bird extends Animal
{
    public void checkUp()
    {
        System.out.println("Bird checkup");
    }
}
public class AnimalDoctor
{
    public void checkAnimals(Animal[] animals)
    {
        for(Animal a:animals)
        {
            a.checkUp();
        }
    }
    public static void main(String[] args)
    {
        Dog[] dogs={new Dog(),new Dog()};
        Cat[] cats={new Cat(),new Cat(),new Cat()};
        Bird[] birds={new Bird()};
        AnimalDoctor doc = new AnimalDoctor();
        doc.checkAnimals(dogs); // pass the Dog[]
        doc.checkAnimals(cats); // pass the Cat[]
        doc.checkAnimals(birds); // pass the Bird[]
    }
}