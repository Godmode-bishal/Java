//Using split() from String class
public class SplitinString
{
    public static void main(String[] args)
    {
        String[] tokens=args[0].split(args[1]);
        System.out.println("Count= "+tokens.length);
        for(String s:tokens)
            System.out.println(">"+s+"<");
    }
}