import java.util.*;
public class TestGenericsArraylist
{
    public static void main(String[] args)
    {
        new TestGenerics1().go();
    }
    public void go()
    {
        ArrayList<Animal> animals=new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);
    }
    public void takeAnimals(ArrayList<Animal> animals)
    {
        for(Animal a:animals)
        {
            a.eat();
        }
    }
}
abstract class Animal
{
    void eat()
    {
        System.out.println("Animal eating");
    }
}
class Dog extends Animal
{
    void bark()
    {}
}
class Cat extends Animal
{
    void meow()
    {}
}