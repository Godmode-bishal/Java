//Mixing generic and non-generic code together-unsafe example
import java.util.*;
public class TestBadLegacy
{
    public static void main(String[] args)
    {
        List<Integer> myList=new ArrayList<Integer>();//type safe collection
        myList.add(4);
        myList.add(6);
        Inserter in=new Inserter();
        in.insert(myList);//pass it to an untyped argument
    }
}
//non generics class
class Inserter
{
    //method with a non-generic List argument
    void insert(List list)
    {
        list.add(new String("42"));//adds to the incoming List
    }
}