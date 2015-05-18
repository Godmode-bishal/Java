//Searching in arrays in java
import java.util.*;
class searchObjArray
{
    public static void main(String[] args)
    {
        String[] sa={"one","two","three","four"};
        Arrays.sort(sa);
        for(String s:sa)
            System.out.print(s+" ");
        System.out.println("\nOne= "+Arrays.binarySearch(sa,"one"));
        System.out.println("Now reverse sort");
        ReSortComparator rs=new ReSortComparator();
        Arrays.sort(sa,rs);
        for(String s:sa)
            System.out.print(s+" ");
        System.out.println("\nOne= "+Arrays.binarySearch(sa,"one"));
        System.out.println("One= "+Arrays.binarySearch(sa,"one",rs));
    }
    static class ReSortComparator implements Comparator<String>
    {
        public int compare(String a, String b)
        {
            return b.compareTo(a);
        }
    }
}
        