//example of java.io.console having readLine() and readPassword()
import java.io.Console;
public class NewConsole
{
    public static void main(String[] args)
    {
        Console c=System.console();//#1:Get a console
        char[] pw;
        String name;
        pw=c.readPassword("%s","pw: ");//#2:Return a character array
        for(char ch:pw)
            c.format("%c",ch);//Format output
        c.format("\n");
        MyUtility mu=new MyUtility();
        while(true)
        {
            name=c.readLine("%s","input?: ");//return a String
            c.format("output: %s \n",mu.doStuff(name));
        }
    }
}
class MyUtility
{
    String doStuff(String arg1)
    {
        return "Result is "+arg1;
    }
}
            
        
        