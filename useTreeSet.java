//Using treeSet
import java.util.*;
public class useTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> times=new TreeSet<Integer>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        //Java 5
        TreeSet<Integer> subSet=new TreeSet<Integer>();
        subSet=(TreeSet)times.headSet(1600);
        System.out.println("J5- last before 4PM is: "+subSet.last());
        
        
        TreeSet<Integer> sub2=new TreeSet<Integer>();
        sub2=(TreeSet)times.tailSet(2000);
        System.out.println("J5- first  8PM is: "+sub2.first());
        //Java 6 
        System.out.println("J6- last before 4PM is: "+times.lower(1600));
        System.out.println("J6- first after  8PM is: "+times.higher(2000));
    }
}
