//Autoboxing
public class TestAutobox
{
    Integer i;
    int j;
    public static void main(String[] args)
    {
        TestAutobox t=new TestAutobox();
        t.go();
    }
    public void go()
    {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}