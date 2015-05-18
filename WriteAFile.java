import java.io.*;
class WriteAFile
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer=new FileWriter("write.txt");
            writer.write("Hello world");
            writer.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}