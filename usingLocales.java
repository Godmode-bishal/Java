//Using Locale:Create a Calendar object, set its date, then convert it to a Date and print it using different Locales.
import java.text.*;
import java.util.*;
public class usingLocales
{
    public static void main(String[] args)
    {
        Calendar c=Calendar.getInstance();
        c.set(2010,11,14);  //December 14,2010. Month is 0 based.
        Date d2=c.getTime();
        Locale locIT=new Locale("it","IT");//Italy
        Locale locPT=new Locale("pt");//Protugal
        Locale locBR=new Locale("pt","BR");//Brazil
        Locale locIN=new Locale("hi","IN");//India
        Locale locJA=new Locale("ja");//Japan
        DateFormat dfUSFull=DateFormat.getInstance();
        System.out.println("US Full: "+dfUSFull.format(d2));
        DateFormat dfIT=DateFormat.getDateInstance(DateFormat.FULL,locIT);
        System.out.println("Italy Full: "+dfIT.format(d2));
        DateFormat dfPT=DateFormat.getDateInstance(DateFormat.FULL,locPT);
        System.out.println("Portugal Full: "+dfPT.format(d2));
        DateFormat dfBR=DateFormat.getDateInstance(DateFormat.FULL,locBR);
        System.out.println("Brazil Full: "+dfBR.format(d2));
        DateFormat dfIN=DateFormat.getDateInstance(DateFormat.FULL,locIN);
        System.out.println("India Full: "+dfIN.format(d2));
        DateFormat dfJA=DateFormat.getDateInstance(DateFormat.FULL,locJA);
        System.out.println("Japan Full: "+dfJA.format(d2));
    }
}
