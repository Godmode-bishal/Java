class Test
{
    public void logIn()
    {
        int count=10;
        System.out.println(" The local variable 'count' can be used here");
    }
    public void doSomething()
    {
        count=20;
        System.out.println("The count variable can't be used here as it is out of scope.");
    }
}
public class TestScope
{
    public static void main(String[] args)
    {
        Test a=new Test();
        a.logIn();
        a.doSomething();
    }
}