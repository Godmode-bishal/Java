import java.util.*;
class DatenTime
{
    public static void main(String[] args)
    {
        String a=String.format("%tA, %<tB %<td",new Date());
        System.out.println(a);
    }
}
