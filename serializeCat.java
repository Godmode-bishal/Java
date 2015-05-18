//Serializing an object and deserializing it.
import java.io.*;
class Cat implements Serializable{}
public class serializeCat
{
    public static void main(String[] args)
    {
        Cat c=new Cat();
        try
        {
            FileOutputStream fs=new FileOutputStream("testSer.txt");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(c);
            os.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        try
        {
            FileInputStream fis=new FileInputStream("testSer.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            c=(Cat)ois.readObject();
            ois.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}