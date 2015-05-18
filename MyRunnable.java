public class MyRunnable implements Runnable
{
    public void run()   //Can't be more restricted than public as inherited classes can't be more restrictive than their superclass implementation.
    {
        go();
    }
    public void go()
    {
        doMore();
    }
    public void doMore(){
        System.out.println("Top of the stack");
    }
}
class ThreadTester
{
    public static void main(String[] args)
    {
        MyRunnable threadJob=new MyRunnable();
        Thread myThread=new Thread(threadJob);
        myThread.start();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException Ie)
        {
            Ie.printStackTrace();
        }
        System.out.println("Back in main");
    }
}
