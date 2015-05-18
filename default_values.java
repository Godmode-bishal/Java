//To show the default values of instant variables and references. Local variables (declared within a method) don't have any default values.
 class PoorDog
{
    private int size;
    private String name;
    
    public int getsize()
    {
        return size;
    }
    
    public String getname()
    {
        return name;
    }
}
public class default_values
{
    public static void main(String[] args)
    {
        PoorDog one=new PoorDog();
        System.out.println("Dog size is "+one.getsize());
        System.out.println("Dog name is "+one.getname());
        System.out.println("hello world");
        boolean b=34.5;
    }
    
}