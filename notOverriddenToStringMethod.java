//Not overridden toString() method of Object class
public class notOverriddenToStringMethod
{
    public static void main(String[] args)
    {
        notOverriddenToStringMethod a=new notOverriddenToStringMethod();
        System.out.println(a);
        /*The preceding output is what you get when you don't override the  toString()
method of class Object.*/
    }
}