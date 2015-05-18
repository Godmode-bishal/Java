class immutableString
{
    public static void main(String[] args)
    {  
        String x="java";
        String y=x;
        System.out.println("y string= "+y);
        x+="bean";
        System.out.println("x string= "+x);
        System.out.println("y string= "+y);
    }
}