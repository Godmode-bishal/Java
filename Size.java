//Size of primitives in Java.No Sizeof(a) like function in Java.
class Size
{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    void size()
    {
        System.out.println("Sizes are a="+size(a)+" b="+b.length()+" c="+c.length()+" d="+d.length()+" e="+e.length()+" f="+f.length());
    }
    public static void main(String[] args)
    {
        Size g=new Size();
        g.size();
    }
}