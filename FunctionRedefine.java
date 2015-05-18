//Function redefining
class Animal
{
    static void doStuff()
    {
        System.out.println("A");
    }
}
public class FunctionRedefine extends Animal
{
    static void doStuff()   //Function redefinition
    {
        System.out.println("D");
    }
    public static void main(String[] args)
    {
        Animal[] a={new Animal(),new FunctionRedefine(), new Animal()};
        for(int i=0;i<a.length;i++)
        {
            a[i].doStuff();
        }
    }
}