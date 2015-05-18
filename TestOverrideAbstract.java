//Extending an abstract class and implementing only an overridden method of the original abstrsct method will give an error.
abstract class Animal
{
    abstract void sound();
}
class cow extends Animal
{
    void sound(int i)
    {
        System.out.println("\nI Moo Moo all day\n");
    }
}
class TestOverrideAbstract
{
    public static void main(String[] args)
    {
        cow jill=new cow();
        jill.sound(2);
    }
}
        