//Just another puzzle
import java.io.*;
class DungeonGame implements Serializable
{
    public int x=3;
    transient long y=4;
    private short z=5;
    int getX()
    {
        return x;
    }
    short getZ()
    {
        return z;
    }
    long getY()
    {
        return y;
    }
}
class DungeonTest
{
    public static void main(String[] args)
    {
        try
        {
            DungeonGame d=new DungeonGame();
            System.out.println(d.getX()+d.getY()+d.getZ());
            FileOutputStream fos=new FileOutputStream("dg.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            FileInputStream fis=new FileInputStream("dg.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            d=(DungeonGame)ois.readObject();
            ois.close();
            System.out.println(d.getX()+d.getY()+d.getZ());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
           