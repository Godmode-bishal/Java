//Overriding toString() of Object class
public class OverrideToStringMethod
{
    public static void main(String[] args)
    {
        Bob f=new Bob("GoBobGo",19);
        System.out.println(f);
    }
}
class Bob
{
    int shoeSize;
    String nickName;
    Bob(String nickName,int shoeSize)
    {
        this.shoeSize=shoeSize;
        this.nickName=nickName;
    }
    public String toString()
    {
        return ("I am Bob, but you can call me "+nickName+". My shoesize is "+shoeSize);
    }
}