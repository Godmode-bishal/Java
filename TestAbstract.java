abstract class Animal
{
    void howdy()
    {
        System.out.println("\nThe animal says howdy\n");
    }
    abstract void sound();
}
abstract class domestic extends Animal
{
    void eat()
    {
        System.out.println("\nWe don't eat meat\n");
    }
    abstract void behaviour();
}
class cow extends domestic
{
    void tail()
    {
        System.out.println("\nWe wag our tails\n");
    }
    void sound()
    {
        System.out.println("Moo !!!");
    }
    void behaviour()
    {
        System.out.println("We are benevolent in nature !!");
    }
}
class TestAbstract
{
    public static void main(String[] args)
    {   
        cow jack=new cow();
        jack.tail();
        jack.sound();
        jack.behaviour();
        jack.eat();
        jack.howdy();
    }
}
    
    