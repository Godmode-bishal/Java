class Shadowing
{
    int count=9;//Declare an instance variable named count. 
    public void logIn()
    {
        int count=10;//Declare a local variable named count.
        System.out.println("Local variable count is "+count);
    }
    public void count()
    {
        System.out.println("Instance variable count is "+count);
    }
    public static void main(String[] args)
    {
        Shadowing a=new Shadowing();
        a.logIn();
        a.count();
    }
}