//Boxing and Widening while overloading.
class BoxAndWide
{
    static void go(Object o)
    {
        Byte b2=(Byte)o;
        System.out.println(b2);
    }
    public static void main(String[] args)
    {
        byte b=5;
        go(5);
    }
}