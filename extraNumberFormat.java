// getMaximumFractionDigits(),setMaximumFractionDigits() ,parse(), and  setParseIntegerOnly()
import java.util.*;
import java.text.*;

public class extraNumberFormat
{
    public static void main(String[] args)
    {
        float f1=123.45678f;
        NumberFormat nf=NumberFormat.getInstance();
        System.out.print(nf.getMaximumFractionDigits()+" ");
        System.out.print(nf.format(f1)+" ");
        nf.setMaximumFractionDigits(5);
        System.out.print(nf.format(f1)+" ");
        try
        {
            System.out.println(nf.parse("1234.567"));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse("1234.567"));
        }
        catch(ParseException pex)
        {
            System.out.println("Parse Exception");
        }
    }
}