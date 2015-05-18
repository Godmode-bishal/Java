//Using Iterators in a List in java
import java.util.*;
class Dog
{
    public String name;
    Dog(String n)
    {
        name=n;
    }
}
public class IteratorJava
{
    public static void main(String[] args)
    {
        List<Dog> d=new ArrayList<Dog>();
        Dog dog=new Dog("Aiko");
        d.add(dog);
        d.add(new Dog("Clover"));
        d.add(new Dog("Magnolia"));
        Iterator<Dog> i3=d.iterator();//Make an iterator
        while(i3.hasNext())
        {
            Dog d2=i3.next();
            System.out.println(d2.name);
        }
        System.out.println("size "+d.size());
        System.out.println("get1 "+d.get(1).name);
        System.out.println("aiko "+d.indexOf(dog));
        d.remove(2);
        Object[] oa=d.toArray();
        for(Object o:oa)
        {
            Dog d2=(Dog)o;
            System.out.println("oa "+d2.name);
        }
    }
}
        
        
        