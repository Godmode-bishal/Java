//Sample "hello world" program of java.
public class TestGreeting
{
    public static void main(String args[])
    {
        Greeting hello=new Greeting();
        hello.greet();
    }
}
public class Greeting
{
    public void greet()
    {
        System.out.println("Hi guys");
    }
}