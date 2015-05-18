//Overloading with varargs in combination with Autoboxing and Widening.
class OverloadVararg
{
    static void wide_vararg(long... x)  //If not static, then an object will have to be made in main.
    {
        System.out.println("Long");
    }
    static void box_vararg(Integer... x)
    {
        System.out.println("Integer");
    }
    public static void main(String[] args)
    {
        int i=5;
        wide_vararg(i,i);
        box_vararg(i,i);
    }
}
    