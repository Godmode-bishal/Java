//When a method or variable member is declared public, it means all other classes, regardless of the package they belong to,
// can access the member (assuming the class itself is visible). 
package book;
import cert.*;
class goo
{
    public static void main(String[] args)
    {
        Sludge o=new Sludge();
        o.testIt();
    }
}