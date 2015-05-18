//Example of NumberFormat class
import java.util.*;
import java.text.*;
public class NumberFormatExample
{
    public static void main(String[] args)
    {
        float f1=123.4567F;
        Locale locFR=new Locale("fr");
        NumberFormat[] nfa=new NumberFormat[4];
        nfa[0]=NumberFormat.getInstance();
        nfa[1]=NumberFormat.getInstance(locFR);
        nfa[2]=NumberFormat.getCurrencyInstance();
        nfa[3]=NumberFormat.getCurrencyInstance(locFR);
        for(NumberFormat nf:nfa)
            System.out.println(nf.format(f1));
    }
}