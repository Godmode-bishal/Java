public class staticVariableSameValue
{
    private static int duckCount=0;
    public staticVariableSameValue()
    {
        duckCount++;
    }
    public static void main(String[] args)
    {
        staticVariableSameValue a=new staticVariableSameValue();
        System.out.println(" Count is "+duckCount);
        staticVariableSameValue b=new staticVariableSameValue();
        System.out.println(" Count is "+duckCount);
    }
}