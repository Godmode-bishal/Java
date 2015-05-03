//Calling GC with Runtime class instance.
import java.util.Date;
public class checkGC
{
    public static void main(String[] args)
    {
        Runtime rt=Runtime.getRuntime();
        System.out.println("Total memory="+rt.totalMemory());
        System.out.println("Before memory="+rt.freeMemory());
        Date d=null;
        for(int i=0;i<1000;i++)
        {
            d=new Date();
            d=null;
        }
        System.out.println("After memory="+rt.freeMemory());
        for(int i=0;i<10;i++)
        {
            rt.gc();
            System.out.println("After GC memory="+rt.freeMemory());
        }
    }
}
        