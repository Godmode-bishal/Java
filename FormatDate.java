//Formatting a date in different ways
import java.text.*;
import java.util.*;
class FormatDate
{
    public static void main(String[] args)
    {
        Date d1=new Date(1000000000000L);
        DateFormat df[]=new DateFormat[6];
        df[0]=DateFormat.getInstance();
        df[1]=DateFormat.getDateInstance();
        df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
        df[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4]=DateFormat.getDateInstance(DateFormat.LONG);
        df[5]=DateFormat.getDateInstance(DateFormat.FULL);
        for(DateFormat dfa:df)
        {
            System.out.println(dfa.format(d1));
        }
    }
}
        
        