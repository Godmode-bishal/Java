class thisKeyword
{
    int size=28;
    void setSize(int size)
    {
        this.size=size;//this.size means current object's instance variable.
    }
    public static void main(String[] args)
    {
        thisKeyword a=new thisKeyword();
        a.setSize(20);
        System.out.println(a.getClass());
        System.out.println(a.hashCode());
        System.out.println(a.toString());
    }
}