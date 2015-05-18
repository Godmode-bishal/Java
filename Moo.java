//Default classes can access each other in the same package.
class zoo
{
    public String coolMethod()
    {
        return "Wow Baby!!";
    }
}
class Moo
{
    public static void main(String[] args)
    {
        zoo z=new zoo();
        System.out.println("A zoo says "+z.coolMethod());
    }
}