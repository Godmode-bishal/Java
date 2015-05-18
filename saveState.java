import java.io.*;
public class saveState implements Serializable
{
    private int width;
    private int height;
    
    public void setWidth(int w)
    {
        width=w;
    }
    public void setHeight(int h)
    {
        height=h;
    }
    public static void main(String[] args)
    {
        saveState myState=new saveState();
        myState.setWidth(50);
        myState.setHeight(20);
        try
        {
            FileOutputStream fs=new FileOutputStream(new File("state.ser"));
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(myState);
            os.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}