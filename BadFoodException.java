//Exception handling
/* Let's first create our exception. We will call it BadFoodException. This exception will be thrown when a bad food is encountered. 
■ Create an enclosing class called MyException and a main() method, which will remain empty for now.
 Create a method called checkFood(). It takes a String argument and throws our exception if it doesn't like the food it was given. 
 Otherwise, it tells us it likes the food. You can add any foods you aren't particularly fond of to the list.
 ■ Now in the main() method, you'll get the command-line argument out of the String array, and then pass that String on to the checkFood() method. 
 Because it's a checked exception, the checkFood() method must declare it, and the main() method must handle it (using a try/catch). 
 Do not have main() declare the exception, because if main() ducks the exception, who else is back there to catch it?
*/
//Throwing my own exception
class MyException extends Exception{}
public class BadFoodException 
{
    public static void main(String[] args)
    {
        BadFoodException me=new BadFoodException();
        try
        {
            me.checkFood(args);
        }
        catch(MyException bfe)
        {
            System.out.println("He doesn't like the food");
        }
    }
    void checkFood(String[] a) throws MyException 
    {
        int i;
        String b[]={"Apple","Mango"};
        for(i=0;i<b.length;i++)
        {
            if(a[0].equals(b[i]))
            {
                System.out.println("I like the food");
                System.exit(0);
            }
        }
        System.out.println("Noo");
        throw new MyException();
 
    }
}
                
        