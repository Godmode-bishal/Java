//use of getDisplayCountry() and getDisplayLanguage()
import java.text.*;
import java.util.*;

public class getDisplayCountryLanguage
{
    public static void main(String[] args)
    {
        Calendar c=Calendar.getInstance();
        c.set(2010,11,14);
        Date d1=c.getTime();
        Locale locBR=new Locale("pt","BR");
        Locale locDK=new Locale("da","DK");
        Locale locIT=new Locale("it","IT");
        System.out.println("def "+locBR.getDisplayCountry());
        System.out.println("loc "+locBR.getDisplayCountry(locBR));
        System.out.println("def "+locDK.getDisplayLanguage());
        System.out.println("loc "+locDK.getDisplayLanguage(locDK));
        System.out.println("d>I "+locDK.getDisplayLanguage(locIT));
    }
}
        
        