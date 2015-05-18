class Duck
{
    int size;
    public Duck()
    {
        size=27;
    }
    public Duck(int duckSize)
    {
        size=duckSize;
    }
}
public class Constructor_overloading
{
    public static void main(String[] args)
    {
        Duck myDuck1=new Duck();
        System.out.println("Default size is "+myDuck1.size);
        Duck myDuck2=new Duck(20);
        System.out.println("User given size is "+myDuck2.size);
    }
}
        