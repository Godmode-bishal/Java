//Using Polymorphic reference type has a price. From a object arraylist, can't reference a Dog.
import java.util.*;
class Dog
{
    public static void main(String[] args)
    {
        ArrayList<Object> myDogArrayList=new ArrayList<Object>();
        Dog adog=new Dog();
        myDogArrayList.add(adog);
        Dog d=myDogArrayList.get(0);
    }
}