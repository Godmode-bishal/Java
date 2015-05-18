enum CoffeeSize{
//8,10 and 16 are passed to the constructor.
BIG(8),HUGE(10),OVERWHELMING(16);
CoffeeSize(int ounces)//constructor
{
    this.ounces=ounces;
}
private int ounces;//an instance variable
public int getOunces()
{
    return ounces;
}
}
class MoreInEnum
{
    CoffeeSize size;//each instances of coffeeSize has an enum
    public static void main(String[] args)
    {
        MoreInEnum drink1=new MoreInEnum();
        drink1.size=CoffeeSize.BIG;
        
        MoreInEnum drink2=new MoreInEnum();
        drink2.size=CoffeeSize.OVERWHELMING;
        
        System.out.println(drink1.size.getOunces());
        System.out.println(drink2.size.getOunces());
        for(CoffeeSize cs:CoffeeSize.values())
        {
                System.out.println(cs+" "+cs.getOunces());
        }
    }
}