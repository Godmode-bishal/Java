class Coffee{
    enum CoffeeSize{BIG, HUGE, OVERWHELMING}
    CoffeeSize size;
}
public class TestEnum{
    public static void main(String[] args)
    {
        Coffee drink=new Coffee();
        drink.size=Coffee.CoffeeSize.BIG;
        System.out.println(" The enum constant we are accessing is: "+drink.size);
    }
}
    