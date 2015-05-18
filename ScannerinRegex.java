//Using Scanner class to find regex
import java.util.*;
public class ScannerinRegex
{
    public static void main(String[] args)
    {
        System.out.print("Input: ");
        System.out.flush();
        try
        {
            Scanner s=new Scanner(System.in);
            String token;
            do
            {
                token =s.findInLine(args[0]);
                System.out.println("Found "+token);
            }while(token!=null);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}