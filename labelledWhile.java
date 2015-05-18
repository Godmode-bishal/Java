//Labelled while loop
public class labelledWhile
{
    public static void main(String[] args)
    {
        int age=15;
        outer:
            while(age<=21)
            {
                if(age==16)
                {
                    age++;
                    System.out.println("Get your driver's license");
                    continue outer;
                }
                else
                {
                    System.out.println("Another year");
                    age++;
                }
                
            }
            
    }
}
                    