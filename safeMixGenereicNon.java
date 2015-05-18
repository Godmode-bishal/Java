//mixing generic and non generic code-safe example
import java.util.*;
public class safeMixGenereicNon
{
    public static void main(String[] args)
    {
        List<Integer> myList=new ArrayList<Integer>();//type safe collection
        myList.add(4);
        myList.add(6);
        Adder adder=new Adder();
        int total=adder.addAll(myList);//pass it to an untyped argument
        System.out.println(total);
    }
}
//non generics class
class Adder
{
    int addAll(List list)
    {
        //method with non-generic List argument, but assumes that it will be integers
        Iterator it=list.iterator();
        int total=0;
        while(it.hasNext())
        {
            int i=((Integer)it.next()).intValue();
            total+=i;
        }
        return total;
    }
}