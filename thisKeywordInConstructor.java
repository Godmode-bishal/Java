public class thisKeywordInConstructor
{
    String name;
    thisKeywordInConstructor(String name)
    {
        this.name=name;
    }
    thisKeywordInConstructor()
    {
        this(makeRandomName());
    }
    static String makeRandomName()
    {
        int x=(int)(Math.random()*5);
        String name=new String[]{"Fluffy","Fido","Rover","Spike","Gigi"}[x];
        return name;
    }
    public static void main(String[] args)
    {
         thisKeywordInConstructor a = new thisKeywordInConstructor();
         System.out.println(a.name);
         thisKeywordInConstructor b = new thisKeywordInConstructor("Zeus");
         System.out.println(b.name);
    }
} 